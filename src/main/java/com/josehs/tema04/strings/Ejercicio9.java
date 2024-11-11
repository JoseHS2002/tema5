package com.josehs.tema04.strings;

import java.util.Scanner;

public class Ejercicio9 {
    /**
     * Imprimir caracteres impares
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String cadena = teclado.nextLine();
        String [] palabras=cadena.split(" ");

        for (int i=0; i< palabras.length; i++){
            String palabra=palabras[i];
            if (i%2!=0){
                System.out.print(palabra.charAt(i));
            }
        }

    }
}
