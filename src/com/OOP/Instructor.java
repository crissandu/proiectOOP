package com.OOP;

public class Instructor extends Angajat { // mostenire

        int aniExperienta;
        String programDeLucru;
        int numarStudenti;

        public Instructor() {
                super();
                aniExperienta = 5;
                programDeLucru = "9:00 - 18:00";
                numarStudenti = 5;
        }

        public static void main(String[] args) {
                Instructor i = new Instructor();
                System.out.println(i.nume);
                System.out.println(i.idAngajat);
                System.out.println(i.aniExperienta);
                System.out.println(i.salariu());
        }

        @Override
        public double salariu() {
                return 3000;
        }
}
