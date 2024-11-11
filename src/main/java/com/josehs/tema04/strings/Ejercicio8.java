package com.josehs.tema04.strings;

import java.util.Scanner;

public class Ejercicio8 {
    /**
     * Escribir cada palabra de una frase en dos columnas distintas
     * Contar los caracteres de la frase
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String cadena = teclado.nextLine();
        String [] palabras=cadena.split(" ");

        for (int i=0; i< palabras.length; i++){
            String palabra=palabras[i];
            int n_letras=0;
            if (cadena != " " && Character.isLetter(palabra.charAt(i))){
                n_letras++;
                System.out.print(palabra+"\n");
                System.out.print("\t"+"    "+palabra+"\n");
                System.out.println("Numero de letras: "+n_letras);
            }  else {
                System.out.println();
            }

        }
        teclado.close();
    }
}
