package com.OOP;

public class Calculator {

    public static void main(String[] args) {
        System.out.println(suma(10, 15, 100, -50, -200, 10, 20, -1000));
        System.out.println(10);
        System.out.println("String");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(suma(1,2));


    }



    public static int suma(int a, int b) {
        return  a + b;
    }
        // overloading - supraIncarcare
    public static int suma(int...a) {
        int sum = 0;
        for (int i = 0; i< a.length; i++) {
            sum += a[i];
        }
        return sum;
    }




}
