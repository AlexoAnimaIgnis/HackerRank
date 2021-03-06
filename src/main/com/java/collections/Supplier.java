package main.com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private final String name;
    private final List<Product> products = new ArrayList<>();

    public Supplier(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }
}
