package com.josehs.tema04.arrays;

import java.util.Scanner;

public class Ejercicio1 {
    /**
     * Introducir 10 valores en un array y decir la media.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Dime 10 numeros: ");
        int numero [] = new int [10];

        numero [0] = keyboard.nextInt();
        numero [1] = keyboard.nextInt();
        numero [2] = keyboard.nextInt();
        numero [3] = keyboard.nextInt();
        numero [4] = keyboard.nextInt();
        numero [5] = keyboard.nextInt();
        numero [6] = keyboard.nextInt();
        numero [7] = keyboard.nextInt();
        numero [8] = keyboard.nextInt();
        numero [9] = keyboard.nextInt();

        keyboard.close();
        System.out.println("Numeros");

        int suma=0;
        for (int i=0; i<10; i++){
            System.out.println(numero[i]);
            suma+=numero[i];
        }
        System.out.println("La media es:\n"+suma/10);
    }
}
