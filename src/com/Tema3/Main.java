package com.Tema3;

public class Main {


    public static void main(String[] args) {

        int distantaTraseu = 1300;
        RaceTrack track = new RaceTrack(distantaTraseu);
        NeedForSpeed nitroCar = NeedForSpeed.nitro();

        while (nitroCar.baterie > 0) {
            nitroCar.drive();
            System.out.println("Distanta nitro: "+nitroCar.distantaParcursa +"m");
            System.out.println("Baterie nitro: " + nitroCar.baterie+ "%");
            System.out.println("Baterie descarcata nitro? " +nitroCar.batteryDrained());
            System.out.println("Poate masina sa termine cursa? "+track.carCanFinish(nitroCar));
            System.out.println("=================================================");
        }


    }
}
