package main.com.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductCatalogue implements Iterable<Product> {

    private final Set<Product> productSet  = new HashSet<>();

    public void isSuppliedBy(Supplier supplier) {
        productSet.addAll(supplier.getProducts());
    }

    @Override
    public Iterator<Product> iterator() {
        return productSet.iterator();
    }
}
