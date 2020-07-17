package main.com.java.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ViewsOverMaps {

    public static void main(String... args) {
        final Map<Integer, Product> idToProduct = new HashMap<>();
        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.window);
        idToProduct.put(3, ProductFixtures.floorPanel);

        System.out.println(idToProduct);
        System.out.println();

        final Set<Integer> ids = idToProduct.keySet();
        System.out.println(ids);

        ids.remove(1);
        System.out.println(ids);
        System.out.println(idToProduct);

//        ids.add(4); will throw UnsupportedOperationException

        final Collection<Product> products = idToProduct.values(); // arent guaranteed to be unique
        System.out.println(products);

        products.remove(ProductFixtures.floorPanel);
        System.out.println(products);
        System.out.println(idToProduct);

//        products.add(ProductFixtures.window); will throw unsupported exception

        final Set<Map.Entry<Integer, Product>> entries = idToProduct.entrySet();
        for(Map.Entry<Integer, Product> entry: entries) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
            entry.setValue(ProductFixtures.floorPanel);
        }

        System.out.println(idToProduct);
    }
}
