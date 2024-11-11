package com.josehs.tema04.strings;

import java.util.Scanner;

public class Ejercicio6 {
    /**
     *Imprimir una frase varias veces
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una frase: ");
        String frases = teclado.nextLine();
        System.out.println("Dime cuantas veces se repite esta frase: ");
        int n = teclado.nextInt();
        for (int i=0; i<n; i++){
            System.out.println(frases);
        }
    }
}
