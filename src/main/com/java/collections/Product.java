package main.com.java.collections;

import java.util.Comparator;
import java.util.Objects;

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
    private final int id;

    public Product(final int id, final String name, final int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product { " +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(getName(), product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getWeight());
    }
}
