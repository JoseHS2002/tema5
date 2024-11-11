package com.josehs.tema04.strings;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        /**
         * Mostrar cada palabra en una linea distinta
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String cadena = teclado.nextLine();
        String [] palabras=cadena.split(" ");

        for (int i=0; i< palabras.length; i++){
            String palabra=palabras[i];
            if (cadena != " "){
                System.out.print(palabra+"\n");
            } else {
                System.out.println();
            }

        }
        teclado.close();
    }
}
