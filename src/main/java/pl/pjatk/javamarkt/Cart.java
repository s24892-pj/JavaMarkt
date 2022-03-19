package pl.pjatk.javamarkt;

import java.util.Arrays;

public class Cart {

    private Product[] products;

    public Cart() {

    }
    public Product[] getProducts() {
        return products;
    }

    public void setProducts() {
        this.products = products;

    }

    @Override
    public String toString() {
        return "Cart{" +
                "products=" + Arrays.toString(products) +
                '}';
    }
}
