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
        int lef, rig;
        System.out.println("Dime una palabra: ");
        palabra = teclado.nextLine();
        polindromo = palabra.toCharArray();
        lef = 0;
        rig = polindromo.length - 1;

        while (lef<rig){
            if (polindromo[lef] == polindromo[rig]){
                rig --;
                lef++;
            } else {
                System.out.println("No es un polindromo");
                break;
            }
        }

        if (lef == rig){
            System.out.println("Es un polindromo");
        }
    }
}
