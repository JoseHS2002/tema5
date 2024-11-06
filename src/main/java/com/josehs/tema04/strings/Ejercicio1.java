package com.josehs.tema04.strings;

import java.util.Scanner;

public class Ejercicio1 {
    /**
     * @author josehs
     * @param args
     * Poner la primera letra en mayuscula
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String cadena = teclado.nextLine();
        String resultado = "";
        String [] palabras=cadena.split(" ");

        for (int i=0; i< palabras.length; i++){
            String palabra=palabras[i];
            String inicial=palabra.substring(0, 1);
            String restante=palabra.substring(1);
            resultado += inicial.toUpperCase()+restante+" ";
        }
        System.out.println(resultado);

    }
}
