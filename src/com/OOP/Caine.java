package com.OOP;

public class Caine extends Animal{

    @Override
    public void alearga() {
        System.out.println("Alearga prin gradina dupa pisici");
    }

    @Override
    public void galagie() {
        System.out.println("Ham Ham");
    }

    @Override
    public boolean zboara() {
        return false;
    }
}
