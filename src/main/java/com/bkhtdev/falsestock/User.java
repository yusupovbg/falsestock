package com.bkhtdev.falsestock;

public class User {
     private int id;
     private String name;
     private String password;
     private String email;
     private UserRole role;

     public User(String name, String password, String email, UserRole role) {
         this.name = name;
         this.password = password;
         this.email = email;
         this.role = role;
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

     public String getPassword() {
         return password;
     }

     public void setPassword(String password) {
         this.password = password;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public UserRole getRole() {
         return role;
     }
}
