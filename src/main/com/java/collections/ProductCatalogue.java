package main.com.java.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ProductCatalogue implements Iterable<Product> {

    private final SortedSet<Product> productSet  = new TreeSet<>(Product.BY_WEIGHT);

    public void isSuppliedBy(Supplier supplier) {
        productSet.addAll(supplier.getProducts());
    }

    public Set<Product> lightVanProducts() {
        Product heaviestLightVanProduct = findHeaviestLightVanProduct();
        return productSet.headSet(heaviestLightVanProduct);
    }

    public Set<Product> heavyVanProducts() {
        Product heaviestLightVanProduct = findHeaviestLightVanProduct();
        return productSet.tailSet(heaviestLightVanProduct);
    }

    private Product findHeaviestLightVanProduct() {
        for(Product product: productSet) {
            if(product.getWeight() >20) {
                return product;
            }
        }
        return productSet.last();
    }

    @Override
    public Iterator<Product> iterator() {
        return productSet.iterator();
    }
}
