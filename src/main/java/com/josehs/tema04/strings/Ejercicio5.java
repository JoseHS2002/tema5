package com.josehs.tema04.strings;

import java.util.Scanner;

public class Ejercicio5 {
    /**
     * Palabra de mayor longitud
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una frase: ");
        String frases = teclado.nextLine();

        int longitud=0;
        int posicion=0;
        int mayor=0;
        int posMayor=0;

        for (int i=0; i<frases.length(); i++){
            while (! Character.isLetter(frases.charAt(i)) && (i+1)<frases.length() ){
                i++;
            }
            if (longitud>mayor){
                mayor=longitud;
                posMayor=posicion;
            }
        }
        String palabras="";
        for (int i=0; i<mayor; i++){
            palabras=palabras.concat(String.valueOf(frases.charAt(posMayor+i)));
        }
        teclado.close();
        System.out.println("La palabra más larga es: "+palabras+" y tiene "+mayor+" caracteres");
    }
}
