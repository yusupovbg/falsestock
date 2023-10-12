package com.bkhtdev.falsestock;

import java.util.LinkedList;

public class UserManangement {
     private LinkedList<User> users = new LinkedList<User>();

     public User registerUser(String name, String password, String email, UserRole role){
         User user = new User(name, password, email, role);
         users.add(user);
         return user;
     }

     public boolean isUserExist(String name){
         for(User user : users){
             if(user.getName().equals(name)){
                 return true;
             }
         }
         return false;
     }

     public User getUserByName(String name) {
          for (User user : users) {
              if (user.getName().equals(name)) {
                  return user;
              }
          }
          return null;
      }
  
      public boolean authenticateUser(String name, String password) {
          User user = getUserByName(name);
          if (user != null && user.getPassword().equals(password)) {
              return true;
          }
          return false;
      }


     public UserRole getUserRole(String name){
           User user = getUserByName(name);
               if(user != null){
                    return user.getRole();
               }
         return null;
     }
}
