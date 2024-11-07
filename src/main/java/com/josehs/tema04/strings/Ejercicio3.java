package com.josehs.tema04.strings;

import java.util.Scanner;

public class Ejercicio3 {
    /**
     * @author josehs
     * Contar palabras
     */
    public static int contarPalabras(String cadena) {
        String[] palabras = cadena.trim().split(" +");
        return palabras.length;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un texto: ");
        String palabrasUsuario = teclado.nextLine();
        teclado.close();
        System.out.println("\nLa cadena contiene "+contarPalabras(palabrasUsuario)+" palabras");
    }

}
