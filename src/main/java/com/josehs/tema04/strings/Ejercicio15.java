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

        System.out.println("Dime el alto");
        String entrada = "";
        entrada = teclado.nextLine();
        int n1 = Integer.parseInt(entrada);

        System.out.println("Dime el ancho");
        String entrada2 = "";
        entrada2 = teclado.nextLine();
        int n2 = Integer.parseInt(entrada2);

        System.out.println("Dime el caracter");
        String entrada3 = "";
        entrada3 = teclado.nextLine();
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
