package com.josehs.tema04.arrays;

public class Ejercicio12 {
    public static void main(String[] args) {
        int rangoArray = 51;

        String[] expresiones = new String[rangoArray];

        for (int i = 0; i < rangoArray; i++) {
            String parteIzquierda = "P(" + i + ") = ";

            String parteDerecha = "V(0)";
            for (int j = 1; j <= i; j++) {
                parteDerecha += " + V(" + j + ")";
            }

            expresiones[i] = parteIzquierda + parteDerecha;
        }

        for (String expresion : expresiones) {
            System.out.println(expresion);
        }
    }
}
