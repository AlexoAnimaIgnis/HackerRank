package main.com.java.collections;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Predicate;

public class HelpDesk {

    private final Queue<Enquiry> enquiries = new ArrayDeque<>();

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

        helpDesk.processPrinterEnquiry();
        helpDesk.processGeneralEnquiry();
        helpDesk.processPrinterEnquiry();
    }
}
