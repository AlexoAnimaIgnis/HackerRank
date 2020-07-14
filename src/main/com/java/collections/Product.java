package main.com.java.collections;

import java.util.Comparator;

public class Product {
    public static Comparator<Product> BY_WEIGHT = Comparator.comparing(Product::getWeight);
    public static Comparator<Product> BY_NAME = Comparator.comparing(Product::getName);
    private final String name;
    private final int weight;

    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product { " +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
