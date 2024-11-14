package com.josehs.tema04.strings;

public class Ejercicio14 {
    /**
     *Imprimir 4 cadenas con numeros del 0 al 9, ir de derecha a izquierda y sustituir "3" por "C"
     */
    public static void main(String[] args) {
        contarDigitos();
    }
    public static void contarDigitos() {
        String n1, n2, n3, n4;
        //Imprimir los numeros en la cuarta cadena
        for (int i = 0; i <= 9; i++) {
            n4 = String.valueOf(i);
            //Sustituir el "3" por "C" en la cuarta cadena
            n4 = n4.equals("3") ? "C" : n4;
            //Imprimir los numeros en la tercera cadena
            for (int j = 0; j <= 9; j++) {
                n3 = String.valueOf(j);
                //Sustituir el "3" por "C" en la tercera cadena
                n3 = n3.equals("3") ? "C" : n3;
                //Imprimir los numeros en la segunda cadena
                for (int k = 0; k <= 9; k++) {
                    n2 = String.valueOf(k);
                    //Sustituir el "3" por "C" en la segunda cadena
                    n2 = n2.equals("3") ? "C" : n2;
                    for (int l = 0; l <= 9; l++) {
                        //Imprimir los numeros en la primera cadena
                        n1 = String.valueOf(l);
                        //Sustituir el "3" por "C" en la primera cadena
                        n1 = n1.equals("3") ? "C" : n1;

                        System.out.println(n4 + "-" + n3 + "-" + n2 + "-" + n1);
                    }
                }
            }
        }
    }
}
