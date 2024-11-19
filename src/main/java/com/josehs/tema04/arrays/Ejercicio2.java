package com.josehs.tema04.arrays;

import java.util.Scanner;

public class Ejercicio2 {
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

        System.out.println("Numeros");

        for (int i=0; i<10; i++){
            System.out.println(numero[i]%2);
        }
    }
}
