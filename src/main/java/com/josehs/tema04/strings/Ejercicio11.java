package com.josehs.tema04.strings;

import java.util.Scanner;

public class Ejercicio11 {
    /**
     *
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Dime tu primer apellido: ");
        String primerApellido = teclado.nextLine();
        System.out.println("Dime tu segundo apellido: ");
        String segundoApellido = teclado.nextLine();

        System.out.println(nombre.toLowerCase()+" "+primerApellido.toLowerCase()+" "+segundoApellido.toLowerCase());
        System.out.println(nombre.toUpperCase()+" "+primerApellido.toUpperCase()+" "+segundoApellido.toUpperCase());
        System.out.println(nombre.length()+primerApellido.length()+segundoApellido.length());
        System.out.println("");
        if (nombre.length()>5) {
            System.out.println(nombre.substring(0, 5));
        }
        if (nombre.length()>2){
            System.out.println(nombre.substring(nombre.length()-2));
        }
        System.out.println("");
        System.out.println(nombre.replaceAll("\\s?",""));
    }
}
