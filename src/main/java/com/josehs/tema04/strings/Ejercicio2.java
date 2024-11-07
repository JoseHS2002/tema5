package com.josehs.tema04.strings;

import java.util.Scanner;

public class Ejercicio2 {
    /**
     * @author josehs
     * @param args
     * Contar vocales y consonantes
     */
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        String frase;
        int contador1 = 0, contador2 = 0, consonantes;
        System.out.println("Escribe una frase");
        frase=teclado.nextLine();

        for (int i = 0; i < frase.length(); i++){
            contador1++;
        }
        for (int i = 0; i < frase.length(); i++){
            if ((frase.charAt(i)=='a') || (frase.charAt(i)=='e') || (frase.charAt(i)=='i') || (frase.charAt(i)=='o') || (frase.charAt(i)=='u')){
                contador2++;
            }
        }
        consonantes = contador1-contador2;
        teclado.close();
        System.out.println("La frase "+frase+" contiene "+contador2+" vocales");
        System.out.println("La frase "+frase+" contiene "+consonantes+" consonantes");
    }
}
