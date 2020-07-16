package main.com.java.collections;

public class Enquiry {
    private final Customer customer;
    private final Category category;

    public Enquiry(final Customer customer, final Category category) {
        this.customer = customer;
        this.category = category;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public Category getCategory() {
        return this.category;
    }

    @Override
    public String toString() {
        return "Enquiry{" +
                "customer=" + customer +
                ", category=" + category +
                '}';
    }
}
