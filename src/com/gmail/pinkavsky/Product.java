package com.gmail.pinkavsky;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Product {
    private String productName;
    private  HashMap <Product, HashMap> hashMap;
    public Product(String productName , HashMap hashMap) {
        this.productName = productName;
        this.hashMap=hashMap;

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                '}';
    }

    public String find ( Month month, Product product){
        Set<Map.Entry<Product, HashMap>>prl = hashMap.entrySet();

        for ( Map.Entry<Product,HashMap> hmse: prl) {
           if (product == hmse.getKey()) {
                Set<Map.Entry<Month, String>> pr2 =hmse.getValue().entrySet();
                   for (Map.Entry<Month,String > val: pr2){
                       if(month == val.getKey()){
                           return val.getValue();
                       }

               }
           }
            }
        return "bad request";
        }

    }

