package com.josehs.tema04.arrays;

public class Ejercicio11 {
    /**
     * Generar un array y crear otro que se imprima en orden inverso.
     * @param args
     */
    public static void main(String[] args) {
        int[] V = {1, 5, 8, 12, 20, 3, 7, 15, 2, 9};
        int[] P = new int[10];

        for (int i= 0; i < V.length; i++){
            P[i] = V[V.length - 1 - i];
        }

        System.out.println(V);
        System.out.println(P);
    }
}
