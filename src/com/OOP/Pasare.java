package com.OOP;

public class Pasare extends Animal{
    @Override
    public void alearga() {
        System.out.println("Defapt zboara");
    }

    @Override
    public void galagie() {
        System.out.println("Chirp chip");

    }

    @Override
    public boolean zboara() {
        return true;
    }
}
