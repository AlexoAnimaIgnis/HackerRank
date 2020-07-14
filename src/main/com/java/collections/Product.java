package main.com.java.collections;

import java.util.Comparator;

public class Product {
    public static Comparator<Product> BY_WEIGHT = Comparator.comparing(Product::getWeight);
    public static Comparator<Product> BY_NAME = Comparator.comparing(Product::getName);
    /** old implementation of comparator
    public static Comparator<Product> BY_WEIGHT = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return Integer.compare(o1.getWeight(), o2.getWeight());
        }
    };*/

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
