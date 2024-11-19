package com.josehs.tema04.arrays;

import java.util.Scanner;

public class Ejercicio2 {
    /**
     * Introducir 10 valores en un array y decir los pares e impares.
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
        System.out.println("Numeros pares");
        System.out.println(numero[0]+", "+numero[2]+numero[4]+", "+numero[6]+", "+numero[8]);

        System.out.println("Numeros impares");
        System.out.println(numero[1]+", "+numero[3]+numero[5]+", "+numero[7]+", "+numero[9]);
    }
}
