package com.OOP;

public class Persoana {

    public String nume;
    public String prenume;
    public int varsta;
    public String adresa;
    public static int numarPerosane = 0;
    static final String SPECIE = "HOME_SAPIENS";

    public static void printClassName() {
        System.out.println("Eu sunt clasa Persoana.");
    }

    public void salutare() {
        System.out.println("Salut! Sunt " + nume);
    }

    public void amAtatiaAni() {
        System.out.println("AM " + varsta +" ani.");
    }

    public Persoana() {
        adresa = "Aproape de casa";
        numarPerosane++;
    }

    public Persoana(String nume) {
        this();
        this.nume = nume;
    }

    public Persoana( int varsta) {
        this("Gigel");  // du-te la constructorul default (nu are argumente) si apeleaza-l
        this.varsta = varsta;

    }

     void ex1() {
        System.out.println("Sunt ex 1");
    }
    static void ex2() {  // asta este exercitiul clasei Persoana !!!!
        System.out.println("Sunt ex 2");
    }

}
