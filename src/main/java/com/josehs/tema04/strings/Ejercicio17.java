package com.josehs.tema04.strings;

import java.util.Scanner;

public class Ejercicio17 {
    /**
     * Decir si la letra del NIF es correcta;
     * @return cL;
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu NIF: ");
        String nID = teclado.nextLine();
        char lC = cL(nID);
        System.out.printf("La letra que corresponde %s es %c \n", nID, lC);
        if (nID.charAt(nID.length()-1) == lC){
            System.out.println("La letra corresponde con el DNI");
        } else {
            System.out.println("Error. La letra correcta es: ");
            nID = nID.substring(0,nID.length()-1)+lC;
            System.out.println(nID);
        }
    }
    public static char cL (String nID){
        String ls="TRWAGMYFPDXBNJZSQVHLCKE";
        int id = Integer.parseInt(nID.substring(0,nID.length()-1));
        int resto = id%23;
        return ls.charAt(resto);
    }
}
