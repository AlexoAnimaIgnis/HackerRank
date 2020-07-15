package main.com.java.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ProductCatalogue implements Iterable<Product> {

    private final Set<Product> productSet  = new TreeSet<>(Product.BY_NAME);

    public void isSuppliedBy(Supplier supplier) {
        productSet.addAll(supplier.getProducts());
    }

    @Override
    public Iterator<Product> iterator() {
        return productSet.iterator();
    }
}
