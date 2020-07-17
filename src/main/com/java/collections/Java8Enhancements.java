package main.com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class Java8Enhancements {

    public static void main(String... args) {
        final Product defaultProduct = new Product( -1, "Whatever the customer wants", 100);

        final Map<Integer, Product> idToProduct = new HashMap<>();
        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.window);
        idToProduct.put(3, ProductFixtures.floorPanel);

//        Product result = idToProduct.getOrDefault(0, defaultProduct);
//        System.out.println(result);

//        Product result = idToProduct.replace(1, new Product(1, "Big door", 50));
//        System.out.println(result);
//        System.out.println(idToProduct.get(1));

        // accepts a function
//        System.out.println(idToProduct);
//        idToProduct.replaceAll((id, oldProduct) ->
//                new Product(id, oldProduct.getName(), oldProduct.getWeight()  + 10));
//        System.out.println(idToProduct);

        // also accepts a function if the value is in the map, return to me. if not create a new one
//        System.out.println(idToProduct);
//        Product result = idToProduct.computeIfAbsent(2, (id) -> new Product(id, "Custom Product", 10));
//        System.out.println(result);
//        System.out.println(idToProduct.get(2));

        System.out.println(idToProduct);
        idToProduct.forEach((key, value) ->
                System.out.println(key + "-->" + value));
    }
}
