package com.OOP;

public class Cerc extends FormaGeometrica {

    double raza;


    @Override
    public double arie() {
        return Math.PI * raza * raza;
    }

    @Override
    public double perimetru() {
        return 0;
    }
}
