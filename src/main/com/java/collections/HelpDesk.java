package main.com.java.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Predicate;

public class HelpDesk {
    private static final Comparator<Enquiry> BY_CATEGORY = new Comparator<Enquiry>() {
        @Override
        public int compare(final Enquiry o1, final Enquiry o2) {
            return o1.getCategory().compareTo(o2.getCategory());
        }
    };

    private final Queue<Enquiry> enquiries = new PriorityQueue<>(BY_CATEGORY);

    public void enquire(final Customer customer, final Category category) {
        enquiries.offer(new Enquiry(customer, category));
    }

    public void processPrinterEnquiry() {
        processEnquiry(enquiry -> enquiry.getCategory() == Category.PRINTER,
                "Is it out of paper?");
    }

    private void processEnquiry(Predicate<Enquiry> predicate, String message) {
        final Enquiry enquiry = enquiries.peek();
        if(enquiry != null && predicate.test(enquiry)){
            enquiries.remove();
            enquiry.getCustomer().reply(message);
        } else {
            System.out.println("No work to do, let's have some coffee!");
        }
    }

    public void processGeneralEnquiry() {
        processEnquiry(enquiry -> enquiry.getCategory() != Category.PRINTER,
                "Have you tried turning it on and off again?");
    }

    public void processAllEnquiries() {
        Enquiry enquiry;

        while ((enquiry = enquiries.poll()) != null) {
            enquiry.getCustomer().reply("Have you tried turning it off and off again? ");
        }
    }

    public static void main(String... args) {
        HelpDesk helpDesk = new HelpDesk();

        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, Category.PRINTER);
        helpDesk.enquire(Customer.MARY, Category.COMPUTER);

        helpDesk.processAllEnquiries();
    }
}
