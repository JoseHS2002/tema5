package com.josehs.tema04.arrays;

import java.util.Scanner;

public class Ejercicio3 {
    /**
     * Introducir 20 valores en un array y decir de 4 en 4.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Dime 10 numeros: ");
        int numero [] = new int [20];

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
        numero [10] = keyboard.nextInt();
        numero [11] = keyboard.nextInt();
        numero [12] = keyboard.nextInt();
        numero [13] = keyboard.nextInt();
        numero [14] = keyboard.nextInt();
        numero [15] = keyboard.nextInt();
        numero [16] = keyboard.nextInt();
        numero [17] = keyboard.nextInt();
        numero [18] = keyboard.nextInt();
        numero [19] = keyboard.nextInt();

        keyboard.close();
        System.out.println("Numeros");
        System.out.print(numero[0]);
        System.out.print(numero[1]);
        System.out.print(numero[2]);
        System.out.println(numero[3]);
        System.out.print(numero[4]);
        System.out.print(numero[5]);
        System.out.print(numero[6]);
        System.out.println(numero[7]);
        System.out.print(numero[8]);
        System.out.print(numero[9]);
        System.out.print(numero[10]);
        System.out.println(numero[11]);
        System.out.print(numero[12]);
        System.out.print(numero[13]);
        System.out.print(numero[14]);
        System.out.println(numero[15]);
        System.out.print(numero[16]);
        System.out.print(numero[17]);
        System.out.print(numero[18]);
        System.out.print(numero[19]);

    }
}
