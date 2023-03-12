package com.sai.Lazy;

public class Product {

    private String productId;

    public Product(String productId){
        super();
        this.productId = productId;
        System.out.println(productId + " initialized");
    }

    public void name(String productName){
        System.out.println(productId + " : " + productName);
    }

}
