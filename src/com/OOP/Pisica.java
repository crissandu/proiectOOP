package com.OOP;

public class Pisica extends Animal{


    @Override
    public void alearga() {
        System.out.println("Alearga peste tot in casa si strica tot");
    }

    @Override
    public void galagie() {
        System.out.println("Miau");

    }

    @Override
    public boolean zboara() {
        return false;
    }
}
