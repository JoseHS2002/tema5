package com.josehs.tema04.strings;

import java.util.Scanner;

public class Ejercicio10 {
    /**
     *
     * Decir si una palabra es un polindromo
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra;
        char [] polindromo;
        int izq, der;
        System.out.println("Dime una palabra: ");
        palabra = teclado.nextLine();
        polindromo = palabra.toCharArray();
        izq = 0;
        der = polindromo.length - 1;

        while (izq<der){
            if (polindromo[izq] == polindromo[der]){
                der --;
                izq++;
            } else {
                System.out.println("No es un polindromo");
                break;
            }
        }

        if (izq == der){
            System.out.println("Es un polindromo");
        }
    }
}
