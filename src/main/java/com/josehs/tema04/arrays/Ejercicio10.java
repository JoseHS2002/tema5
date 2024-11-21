package com.josehs.tema04.arrays;

public class Ejercicio10 {
    public static void main(String[] args) {

        int[] P = {1, 5, 8, 12, 20, 3, 7, 15, 2, 9};

        int[] S = new int[P.length];
        int contador = 0;

        for (int i = 0; i < P.length; i++) {
            if (P[i] > 10) {
                S[contador] = P[i];
                contador++;
            }
        }

        System.out.println("Contenido del array S (elementos mayores que 10):");
        for (int i = 0; i < contador; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + S[i]);
        }
    }
}
