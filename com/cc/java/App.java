package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // System.out.println(new Cat());
    
       Cat cat = new Cat(); 
       System.out.println("Blick von aussen " + cat);
       cat.tellYourAddress();


       Cat cat2 = new Cat();
       System.err.println("Blick von aussen " + cat2);
        cat2.tellYourAddress();

   }

}