package com.josehs.tema04.strings;

import java.util.Scanner;

public class Ejercicio4 {
    /**
     * @author josehs
     * @param args
     * Contar vocales y consonantes
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char[] vocales={'a','e','i','o','u'};
        char[] consonantes={'b','c','ç','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z'};

        String voc="";
        String cons="";

        int nVoc=0;
        int nCons=0;

        System.out.println("Dime una frase: ");
        String palabras = teclado.nextLine();

        for (int i=0; i<palabras.length(); i++){
            for (int a=0; a<vocales.length; a++){
                if (palabras.charAt(i)==vocales[a]){
                    nVoc++;
                    voc+=palabras.charAt(i);
                }
            }
            for (int a=0; a<consonantes.length; a++){
                if (palabras.charAt(i)==consonantes[a]){
                    nCons++;
                    cons+=palabras.charAt(i);
                }
            }
        }
        teclado.close();
        System.out.println("Frase original: "+palabras);
        System.out.println("Vocales("+nVoc+"): "+voc);
        System.out.println("Consonantes("+nCons+"): "+cons);
    }
}
