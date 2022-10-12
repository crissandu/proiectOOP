package com.cosulCuFructe;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        out.printf("Hello din sout static");



    }


    public static int adunare(int x, int y) {
        return x + y;
    }

    // Overload - SupraIncarcare
    public static int adunare(int x, int y, int z) {
        return x + y + z;
    }

    public static int adunare(int... x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;

    }


}
