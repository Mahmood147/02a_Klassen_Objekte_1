package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // System.out.println(new Cat());
    
       Cat cat = new Cat(); 
       System.out.println("Blick von aussen " + cat);
       output("Fuck yuu " + cat.getInstanceVariable());
        
       output("Test");

       Cat cat2 = new Cat();
       System.err.println("Blick von aussen " + cat2);
        cat2.getInstanceVariable();

   }
    public static void output(String outputStr){
         System.out.println(outputStr);


    }



}