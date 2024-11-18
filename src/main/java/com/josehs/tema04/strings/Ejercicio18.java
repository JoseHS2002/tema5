package com.josehs.tema04.strings;

import java.util.Scanner;

public class Ejercicio18 {
    /**
     *
     * Decir el numero de la suerte
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int day, month, year, lucky, sum, n1, n2, n3, n4;
        System.out.println("Dime tu fecha de nacimiento: ");
        String date = keyboard.nextLine();
        char day = date.charAt();
        char month = date.charAt();
        char year = date.charAt();
        sum = day+month+year;
        n1 = sum/1000;
        n2 = sum/100%10;
        n3 = sum/10%10;
        n4 = sum%10;
        lucky = n1+n2+n3+n4;
        System.out.println("Tu numero de la suerte es: "+lucky);
    }
}
