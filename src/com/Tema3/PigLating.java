package com.Tema3;

public class PigLating {

    public static void main(String[] args) {
        System.out.println(esteVocala('b'));
        System.out.println(cautaPigLatin("text"));
        System.out.println(cautaPigLatin("Traseu"));
        System.out.println(cautaPigLatin("pppppttttp"));
        System.out.println(cautaPigLatin("Vrabie"));
        System.out.println(cautaPigLatin("Transfagarasan"));
        System.out.println("");
        int _Variabila;
        int V1_asfr21r2r;
        int numarMare =  4_300_205;
        int _1243525;
        // int 1B3c    --> Illegal

        /*
         text   -> t (false)   e (true)  --> raspuns = ext => extt => (+ay) =? exttay
        ppptttp -> raspuns =""; nu are vocale
         */


    }


    public static boolean esteVocala(char c) {
        // vefifica daca este vocala si incepe cu litere mari sau mici
        if(c == 'a' || c == 'A' || c == 'e'|| c == 'E' || c == 'i'
        || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
            return true;
        }
        return false;
    }
    public static String cautaPigLatin(String input) {
        String raspuns ="";  // initializare raspuns
        // iteram prin String
        int i;
        for (i=0; i <input.length();i++) {
            if(esteVocala(input.charAt(i))) {
                raspuns = input.substring(i);
                break;
            }
        }
        if(i == input.length()) {
            // nu am gasit nicio vocala
            return "";
        }
        // ia tot ce e inainte de vocala si copiaza la final
        raspuns = raspuns + input.substring(0,i);
        raspuns += "ay";
        return raspuns;
    }




}
