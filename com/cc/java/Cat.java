package com.cc.java;

public class Cat 
{
    /*
    public void sayHello()
    {
        System.out.println("Meow");
    }
    */

    String name;
    String furColor;
    int age;

    public String tellYourName()
    {
        // System.out.println(this.name);
        return this.name;
    }

    public void tellYourAddress()
    {
        System.out.println(this);
    }

    public String tellYourFurColor()
    {
        // System.out.println(this.furColor);
        return this.furColor;
    }
    
    public int tellYourAge()
    {
        // System.out.println(this.age);
        return this.age;
    }
    
}
