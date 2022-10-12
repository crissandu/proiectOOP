package com.OOP;

public class DataAngajare {

    private String zi;
    private String luna;
    private String an;

    public DataAngajare() {
        this. zi = "15";
        this.luna = "12";
        this.an = "2000";
    }

    public String getDataAngajare() {
        return zi + "/" + luna +"/" + an;
    }

}
