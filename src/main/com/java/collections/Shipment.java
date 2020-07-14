package main.com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {
    private static final int LIGHT_VAN_MAX_WEIGHT = 20;

    private final List<Product> products = new ArrayList<>();

    public void add(Product product){
        products.add(product);
    }

    public void replace(Product oldProduct, Product newProduct) {
        //find the index of the old product and use set to update the value
        final int index = products.indexOf(oldProduct);
        products.set(index, newProduct);
    }

    public void remove(Product product) {
        products.remove(product);
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
