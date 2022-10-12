package com.OOP;

import java.util.ArrayList;

public class ListaAnimalute {

    public static void main(String[] args) {
        ArrayList<Animal> listaAnimale = new ArrayList<>();
        listaAnimale.add(new Pisica());
        listaAnimale.add(new Caine());
        listaAnimale.add(new Pasare());
        Animal p = new Pisica();

        for(Animal tipAnimal: listaAnimale) {
            tipAnimal.galagie();
            tipAnimal.alearga();
        }

    }


}
