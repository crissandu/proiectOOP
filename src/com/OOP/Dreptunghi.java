package com.OOP;

public class Dreptunghi extends FormaGeometrica{

    double latura;
    double intaltime;

    @Override
    public double arie() {
        return latura * intaltime;
    }

    @Override
    public double perimetru() {
        return 0;
    }
}
