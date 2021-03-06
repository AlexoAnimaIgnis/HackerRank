package main.com.java.collections;

public class ProductFixtures {

    public static Product door = new Product(1,"Wooden door", 35);
    public static Product floorPanel = new Product(2, "Floor Panel", 25);
    public static Product window = new Product(3, "Glass Window", 10);

    public static Supplier bobs = new Supplier("Bob's Household supplies");
    public static Supplier kates = new Supplier("Kate's Home Goods!");

    static {
        bobs.getProducts().add(door);
        bobs.getProducts().add(floorPanel);

        kates.getProducts().add(floorPanel);
        kates.getProducts().add(door);
        kates.getProducts().add(window);
    }
}
