package main.com.java.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class HelpDesk {

    private final Queue<Enquiry> enquiries = new ArrayDeque<>();

    public void enquire(final Customer customer, final Category category) {
        enquiries.offer(new Enquiry(customer, category));
    }

    public void processPrinterEnquiry() {
        final Enquiry enquiry = enquiries.peek();
        if(enquiry != null && enquiry.getCategory() == Category.PRINTER){
            enquiries.remove();
            enquiry.getCustomer().reply("Is it out of paper?");
        } else {
            System.out.println("No work to do, let's have some coffee!");
        }
    }

    public void processGeneralEnquiry() {
        final Enquiry enquiry = enquiries.peek();
        if(enquiry != null && enquiry.getCategory() != Category.PRINTER){
            enquiries.remove();
            enquiry.getCustomer().reply("Have you tried turning it on and off again?");
        } else {
            System.out.println("No work to do, let's have some coffee");
        }
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
