package com.damienC.homeShop;

import java.util.Map;

public class Bill {
    private Client client;
    private Map<Product, Integer> product;


    // creation of a constructor - use when there is no setter and he would to change a value

    public Bill(Client client){
        this.client = client;
    }

    /**
     * Add a product with a quantity
     * @param product product to add
     * @param quantity quantity of the product
     */
    public void addProduct (Product product, Integer quantity){
        this.product.put(product, quantity);
    }

    public Client getClient() {
        return client;
    }

    public Map<Product, Integer> getProduct() {
        return product;
    }
}
