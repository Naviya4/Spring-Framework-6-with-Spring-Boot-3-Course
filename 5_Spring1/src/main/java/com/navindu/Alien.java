package com.navindu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {

    @Value("24")
    private int age;
    // private  Laptop lap = new Laptop(); To call the method "compile" in Laptop class, create an object of Laptop class.
    // since we're using spring, we don't want to create the object like above. we need to inject this object.

//    @Autowired
//    @Qualifier("laptop")
    private Computer com;
    private int salary;

    public Alien () {
        System.out.println("Alien Object Created");
    }

//    public Alien (int age) {
//        System.out.println("Parameterized Constructor Called");
//        this.age = age;
//    }

//    @ConstructorProperties({"lap", "age"})
//    public Alien(Computer com, int age) {
//        this.lap = lap;
//        this.age = age;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("setter called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Coding");
        com.compile();
    }
}
