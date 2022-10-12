package com.Tema3;

public class RaceTrack {

    private int distanta;

    public RaceTrack(int distanta) {
        this.distanta = distanta;
    }

    public RaceTrack() {
        this.distanta = 300;
    }

    public boolean carCanFinish(NeedForSpeed car) {
        while (car.baterie >0) {
            return true;
        }
        return false;
    }


}
