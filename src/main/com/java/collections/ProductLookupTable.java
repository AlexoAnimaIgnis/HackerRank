package main.com.java.collections;

public interface ProductLookupTable {
    Product lookupById(int id);

    void addProduct(Product productToAdd);

    void clear();
}
