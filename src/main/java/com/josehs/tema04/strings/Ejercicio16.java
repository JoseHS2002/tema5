package com.josehs.tema04.strings;

import java.util.Scanner;

public class Ejercicio16 {
    /**
     * Decir la letra del DNI;
     * @return Integer.parseInt(teclado.nextLine());
     * @return dniNumero;
     *
     */
    public Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int DNI = solicitarDocumentoNacionalIdentificacion();
        String NIF = calcularLetra(DNI);
        System.out.println("El NIF del DNI "+DNI+" es: "+DNI+NIF);
    }
    public static int solicitarDocumentoNacionalIdentificacion(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu DNI");
        return Integer.parseInt(teclado.nextLine());
    }
    public static String calcularLetra(int dni){
        String ls = "TRWAGMYFPDXBNJZSQVHLCKE";
        char l = ls.charAt(dni % 23);
        String dniNumero = "" + l;
        return dniNumero;
    }
}
