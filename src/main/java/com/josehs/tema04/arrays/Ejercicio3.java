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
        System.out.println(numero[0]+", "+numero[1]+", "+numero[2]+numero[3]);
        System.out.println(numero[4]+", "+numero[5]+", "+numero[6]+", "+numero[7]);
        System.out.println(numero[8]+", "+numero[9]+", "+numero[10]+", "+numero[11]);
        System.out.println(numero[12]+", "+numero[13]+", "+numero[14]+", "+numero[15]);
        System.out.print(numero[16]+", "+numero[17]+", "+numero[18]+", "+numero[19]);

    }
/*
    public static String determinarLongitudMaxima(double array, int decimales) {
        if (array==null){
            return null;
        }
        int longitudMaxima = 0;
        String formato = "%.";

        return longitudMaxima;
    }



    public static String arrayToString(double[] array, int decimales, int columnas, int padding){
        StringBuilder sb = new StringBuilder();
        String formato = "%."+decimales+"f";
        int tamanyoColumna = determinarLongitudMaxima(array, decimales, padding);
        String formatoColumna = "%-"+tamanyoColumna+"s";
        for (int i=0; i < array.length; i++) {
            sb.append(String.format(formatoColumna, array[i]));
            if ((i+1)) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
*/
}
