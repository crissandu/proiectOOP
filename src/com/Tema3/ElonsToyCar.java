package com.Tema3;

public class ElonsToyCar {

    private static int baterie = 100;
    private int totalDistance;

    public int drive() {
        if(baterie > 0) {
            baterie -= 1;
            return totalDistance += 20;
        }
        return 0;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + totalDistance + " meters";
    }

    public String batteryDisplay() {
        if(baterie <=0) {
            return "Battery is empty";
        }
        return "Battery at " +baterie+ "%";
    }



}
