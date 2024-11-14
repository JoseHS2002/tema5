package com.josehs.tema04.strings;

import java.util.Scanner;

public class Ejercicio12 {
    /**
     * Sustituir palabras
     * Mantener palabras
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un texto: ");
        String texto = teclado.nextLine();
        System.out.println(texto.replaceAll("[es]", "no por"));
        System.out.println(texto.replaceAll("[^esto, ^es, ^bueno]", "*"));
        teclado.close();
    }
}
