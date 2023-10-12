package com.bkhtdev.falsestock;

public enum UserRole {
     ADMIN, USER;

     @Override
     public String toString(){
          return this.name().toLowerCase();
     }
}
