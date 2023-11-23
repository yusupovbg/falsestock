package com.bkhtdev.falsestock;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Product{
     private int id;
     private String name;
     private String description;
     private double price;
     private int quantity;

     public Product(String name, String description, double price, int quantity) {
         this.name = name;
         this.description = description;
         this.price = price;
         this.quantity = quantity;
     }

     public int getId() {
         return id;
     }
     public void setId(int id) {
         this.id = id;
     }
     public String getName() {
         return name;
     }
     public void setName(String name) {
         this.name = name;
     }
     public String getDescription() {
         return description;
     }
     public void setDescription(String description) {
         this.description = description;
     }
     public double getPrice() {
         return price;
     }
     public void setPrice(double price) {
         this.price = price;
     }
     public int getQuantity() {
         return quantity;
     }
     public void setQuantity(int quantity) {
         this.quantity = quantity;
     }
}

public class ProdutDataAccess {
     private LinkedList<Product> products = new LinkedList<Product>();
     private Map<Integer, Product> productMap = new HashMap<Integer, Product>();

     public void addProduct(Product product){
         int id = products.size() + 1;
         product.setId(id);
         products.add(product);
         productMap.put(product.getId(), product);
     }

     public Product getProduct(int id){
         return productMap.get(id);
     }

     public LinkedList<Product> getProducts(){
         return products;
     }

     public void updateProduct(Product product){
         int productId = product.getId();
         Product oldProduct = productMap.get(productId);

         if(oldProduct != null){
             //Update the product in a hashmap
             productMap.put(productId, product);

            //Update the product in a linkedlist
            int index = products.indexOf(oldProduct);
            products.set(index, product);
         }
     }

     public void deleteProduct(int id){
         Product product = productMap.get(id);

         if(product != null){
             //Delete the product from a hashmap
             productMap.remove(id);

             //Delete the product from a linkedlist
             products.remove(product);
         }
     }
}
