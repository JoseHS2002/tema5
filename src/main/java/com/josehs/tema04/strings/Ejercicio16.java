package com.josehs.tema04.strings;

import java.util.Scanner;

public class Ejercicio16 {
    /**
     * Decir la letra del DNI;
     * @return Integer.parseInt(teclado.nextLine());
     * @return dniNumero;
     *
     */
    public static void main(String[] args) {
        int DNI = solicitarDNI();
        String NIF = calcularNIF(DNI);
        System.out.println("El NIF del DNI "+DNI+" es: "+DNI+NIF);

    }
    public static int solicitarDNI(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu DNI");
        return Integer.parseInt(teclado.nextLine());
    }
    public static String calcularNIF(int DNI){
        String ls = "TRWAGMYFPDXBNJZSQVHLCKE";
            char l = ls.charAt(DNI % 23);
        String dniNumero = "" + l;
        return dniNumero;
    }
}
