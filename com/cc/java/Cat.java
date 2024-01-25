package com.cc.java;

// import java.sql.Struct;

public class Cat 
{
    /*
    public void sayHello()
    {
        System.out.println("Meow");
    }
    */

    private String name;
    private String furColor;
    private int age;

    

    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    public String getName()
    {
        if (getPermission()) 
        {
            return name;
        } 
        else 
        {
            return "Sorry, no permission!";
        }
    }

    // public String tellYourName()
    // {
    //     // System.out.println(this.name);
    //     return this.name;
    // }

    public void setName(String name)
    {
        this.name = name;
    }

    // public void tellYourAddress()
    // {
    //     System.out.println(this);
    // }

    // public String tellYourFurColor()
    // {
    //     // System.out.println(this.furColor);
    //     return this.furColor;
    // }

    public String getFurColor()
    {
        return furColor;
    }
    
    // public int tellYourAge()
    // {
    //     // System.out.println(this.age);
    //     return this.age;
    // }

    public int getAge()
    {
        return age;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }

    private boolean getPermission()
    {
        return true;
    }
}
