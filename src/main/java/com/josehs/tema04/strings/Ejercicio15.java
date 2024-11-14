package com.josehs.tema04.strings;

import java.util.Scanner;

public class Ejercicio15 {
    /**
     * Hacer un rectangulo con un caracter
     */
    static int i = 0;
    static int j = 0;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String entrada, entrada2, entrada3;

        System.out.println("Dime el alto");
        entrada = teclado.toString();
        int n1 = Integer.parseInt(entrada);

        System.out.println("Dime el ancho");
        entrada2 = teclado.toString();
        int n2 = Integer.parseInt(entrada2);

        System.out.println("Dime el caracter");
        entrada3 = teclado.toString();
        int n3 = Integer.parseInt(entrada3);

        teclado.close();
        while (i<n1) {
            while (j<n2){
                System.out.println(n3);
                j++;
            }
            System.out.println();
            j=0;
            i++;
        }
    }
}
