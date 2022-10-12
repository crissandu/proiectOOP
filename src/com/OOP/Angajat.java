package com.OOP;

public class Angajat extends Persoana implements Salariu {  // un angajat este o Persoana

    public int idAngajat;
    DataAngajare dataAngajare;
    static int counter = 505; // eu apartin clasei

    public Angajat() {
        super("Ionescu");
        idAngajat = counter + 20;
        counter++;
        dataAngajare = new DataAngajare();
    }

    public static void main(String[] args) {
        Angajat a = new Angajat();
        a.salutare();
    }
    @Override
    public void salutare() {
        System.out.println("Buna ziua! Sunt " +nume);
    }

    public String dataAngajare() {
        return dataAngajare.getDataAngajare();
    }

    @Override
    public double salariu() {
        return 0;
    }
}
