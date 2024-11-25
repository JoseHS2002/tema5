package com.josehs.tema04.arrays;

public class Ejercicio13 {
    public static void main(String[] args) {

        int[] V = new int[51];

        for (int i = 0; i < V.length; i++) {
            V[i] = (int) (Math.random() * 100);
        }

        int[] P = new int[V.length];
        int contadorPares = 0;

        for (int elemento : V) {
            if (elemento % 2 == 0) {
                P[contadorPares] = elemento;
                contadorPares++;
            }
        }

        System.out.println("Array V:");
        for (int elemento : V) {
            System.out.print(elemento + " ");
        }
        System.out.println();

        if (contadorPares > 0) {
            System.out.println("Array P: ");
            for (int i = 0; i < contadorPares; i++) {
                System.out.print(P[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Error, no se ha podido encontrar ningun numero par.");
        }
    }
}