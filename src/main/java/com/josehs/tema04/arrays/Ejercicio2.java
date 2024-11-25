package com.josehs.tema04.arrays;

import java.util.Arrays;
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
/*
    public static String arrayToString(char[] array, Paridad paridad){
        final int NUM_ELEMENTOS = paridad == Paridad.PAR ? array.length / 2 : array.length / 2 +1;
        char[] resultado;
        int contador = 0;
        int inicio = paridad == Paridad.par;
        for (int i = paridad == Paridad.PAR ? 0 : 1; i < array.length; i += 2){
            resultado[contador]= array[i];
        }
        return Arrays.toString();
    }

    public static String arrayToString(double[] array, int decimales){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        String espacio = "";
        String coma = ", ";
        String formato = "%."+decimales;
        for (int i=0; i < array.length; i++) {
            if (i==array.length -1){
                coma = "";
            }
            sb.append(String.format(" %.4f", array[i]));
            if (i == 0) {
                espacio = " ";
            }
        }
        sb.append("]");
        return sb.toString();
    }
*/
}
