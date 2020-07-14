package main.com.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcepts {

    public static void main (String... args) {
        Product door = new Product("Wooden door", 35);
        Product floorpanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorpanel);
        products.add(window);

        /** Using iterator interface
        final Iterator<Product> productIterator = products.iterator();
        while(productIterator.hasNext()) {
            Product product = productIterator.next();
            System.out.println(product);
        }*/


        /** for each construct */
        for(Product product: products) {
            System.out.println(product);
        }

    }
}
