package com.josehs.tema04.strings;

import java.util.Scanner;

public class Ejercicio13 {
    /**
     *Hacer un menu que diga la palabra más larga, más corta y el número de vocales
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("==============");
            System.out.println("1. Palabra más larga.");
            System.out.println("2. Palabra más corta.");
            System.out.println("3. Número de vocales.");
            System.out.println("------------------------------------");
            System.out.println("0. Salir");
            opcion = Integer.parseInt(teclado.nextLine());
            if (opcion == 1){
                //Decir cual es la palabra mas larga
                String palabra1, palabra2, palabra3;
                System.out.println("Escribe la primera palabra");
                palabra1 = teclado.nextLine();
                System.out.println("Escribe la segunda palabra");
                palabra2 = teclado.nextLine();
                System.out.println("Escribe la tercera palabra");
                palabra3 = teclado.nextLine();

                int p1 = palabra1.length();
                int p2 = palabra2.length();
                int p3 = palabra3.length();

                if (p1 > p2 && p1 > p3) {
                    System.out.println(palabra1+": La primera palabra es la más larga");
                } else if (p2 > p1 && p2 > p3) {
                    System.out.println(palabra2+": La segunda palabra es la más larga");
                } else if (p3 > p1 && p3 > p2) {
                    System.out.println(palabra3 + ": La tercera palabra es la más larga");
                } else {
                    System.out.println("Las tres palabras tienen la misma longitud");
                }

                if (palabra1.contains(" ")){
                    System.out.println("Error: No puede haber espacios en blanco");
                } else if (palabra2.contains(" ")) {
                    System.out.println("Error: No puede haber espacios en blanco");
                } else if (palabra3.contains(" ")) {
                    System.out.println("Error: No puede haber espacios en blanco");
                }

            } else if (opcion == 2) {
                //Decir cual es la palabra mas corta
                String palabra1, palabra2, palabra3;
                System.out.println("Escribe la primera palabra");
                palabra1 = teclado.nextLine();
                System.out.println("Escribe la segunda palabra");
                palabra2 = teclado.nextLine();
                System.out.println("Escribe la tercera palabra");
                palabra3 = teclado.nextLine();

                int p1 = palabra1.length();
                int p2 = palabra2.length();
                int p3 = palabra3.length();

                if (p1 < p2 && p1 < p3) {
                    System.out.println(palabra1+": La primera palabra es la más corta");
                } else if (p2 < p1 && p2 < p3) {
                    System.out.println(palabra2+": La segunda palabra es la más corta");
                } else if (p3 < p1 && p3 < p2){
                    System.out.println(palabra3+": La tercera palabra es la más corta");
                } else {
                    System.out.println("Las tres palabras tienen la misma longitud");
                }

                if (palabra1.contains(" ")){
                    System.out.println("Error: No puede haber espacios en blanco");
                } else if (palabra2.contains(" ")) {
                    System.out.println("Error: No puede haber espacios en blanco");
                } else if (palabra3.contains(" ")) {
                    System.out.println("Error: No puede haber espacios en blanco");
                }

            } else if (opcion == 3){
                //Numero de vocales
                char[] vocales={'a','e','i','o','u'};
                String voc="";
                int nVoc=0;
                System.out.println("Dime una palabra: ");
                String palabra = teclado.nextLine();

                for (int i=0; i<palabra.length(); i++){
                    for (int a=0; a<vocales.length; a++){
                        if (palabra.charAt(i)==vocales[a]){
                            nVoc++;
                            voc+=palabra.charAt(i);
                        }
                    }
                }

                if (palabra.contains(" ")){
                    System.out.println("Error: No puede haber espacios en blanco");
                } else if (palabra.contains(" ")) {
                    System.out.println("Error: No puede haber espacios en blanco");
                } else if (palabra.contains(" ")) {
                    System.out.println("Error: No puede haber espacios en blanco");
                }

                teclado.close();
                System.out.println("Palabra original: "+palabra);
                System.out.println("Vocales("+nVoc+"): "+voc);
            }
        } while (opcion != 0);
    }
}
