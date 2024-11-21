package com.josehs.tema04.arrays;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio8 {
    public static Random random = new Random();
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        rellenarArrayNumero();
    }

    /**
     * rellenarArrayNumero
     */
    public static void rellenarArrayNumero() {
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }
        System.out.println("Los números son: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
        System.out.print("Adivina uno de los números: ");
        int adivinanza = keyboard.nextInt();
        boolean adivinado = false;
        for (int numero : numeros) {
            if (numero == adivinanza) {
                adivinado = true;
                break;
            }
        }

        if (adivinado) {
            System.out.println("¡Adivinaste!");
        } else {
            System.out.println("No adivinaste. Intenta de nuevo.");
        }
    }
}
