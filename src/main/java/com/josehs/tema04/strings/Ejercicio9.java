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

        //StringBuilder impares = new StringBuilder();
        for (int i=1; i< palabras.length; i+=2){
            String palabra=palabras[i];
            if (i%2!=0){
                System.out.print(palabra.charAt(i));
            }
        }
        teclado.close();
    }
}
