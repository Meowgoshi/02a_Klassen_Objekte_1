package com.cc.java;

public class App {
    
    public static void main(String[] args) 
    {
        
        Cat cat = new Cat("Legoshi","gray",3);    // Instanzierung

        // Wertzuweisung
        // cat.name = "Legoshi";
        // cat.furColor ="gray";
        // cat.age = 3;

        //Ausgabe
        // System.out.println(cat);
        // cat.sayHello();
        output(cat.getName());
        output(cat.getFurColor());
        // System.out.println(cat.tellYourAge()); // int --> string
        output(String.valueOf(cat.getAge()));
        // cat.tellYourAddress();
        // cat.tellYourName();
        // cat.tellYourFurColor();
        // cat.tellYourAge();

        
        output("----------------------------");
 
        Cat cat2 = new Cat("Ripley","black",2);
        // cat2.name = "Ripley";
        // cat2.furColor = "black";
        // cat2.age = 2;
 
        // System.out.println(cat2);
        output(cat2.getName());
        output(cat2.getFurColor());
        output(String.valueOf(cat2.getAge()));
        // cat2.tellYourAddress();

        System.out.println("----------------------------");

        Cat cat3 = new Cat("Yuffie","brown",5);
        // cat3.name = "Yuffie";
        // cat3.furColor = "brown";
        // cat3.age = 5;

        // System.out.println(cat3);
        output(cat3.getName());
        output(cat3.getFurColor());
        output(String.valueOf(cat3.getAge()));
        // cat2.tellYourAddress();
        
    }

     // statische Methode --- in Klasse
     public static void output(String outputStr){
        System.out.println(outputStr);
    }

   

}

