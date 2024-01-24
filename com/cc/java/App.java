package com.cc.java;

public class App {
    
    public static void main(String[] args) 
    {
        
        Cat cat = new Cat();    // Instanzierung

        // Wertzuweisung
        cat.name = "Legoshi";
        cat.furColor ="gray";
        cat.age = 3;

        //Ausgabe
        // System.out.println(cat);
        // cat.sayHello();
        output(cat.tellYourName());
        output(cat.tellYourFurColor());
        // System.out.println(cat.tellYourAge()); // int --> string
        output(String.valueOf(cat.tellYourAge()));
        // cat.tellYourAddress();
        // cat.tellYourName();
        // cat.tellYourFurColor();
        // cat.tellYourAge();

        
        System.out.println("----------------------------");
 
        Cat cat2 = new Cat();
        cat2.name = "Ripley";
        cat2.furColor = "black";
        cat2.age = 2;
 
        // System.out.println(cat2);
        System.out.println(cat2.tellYourName());
        System.out.println(cat2.tellYourFurColor());
        System.out.println(cat2.tellYourAge());
        // cat2.tellYourAddress();

        System.out.println("----------------------------");

        Cat cat3 = new Cat();
        cat3.name = "Yuffie";
        cat3.furColor = "brown";
        cat3.age = 5;

        // System.out.println(cat3);
        System.out.println(cat3.tellYourName());
        System.out.println(cat3.tellYourFurColor());
        System.out.println(cat3.tellYourAge());
        // cat2.tellYourAddress();
        
    }

     // statische Methode --- in Klasse
     public static void output(String outputStr){
        System.out.println(outputStr);
    }

   

}

