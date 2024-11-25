package com.josehs.tema04.arrays;

public class Ejercicio12 {
    /**
     * Imprimir dos arrays en forma de escalera
     * @param args
     */
    public static void main(String[] args) {
        int rangoArray = 51;
        String[] escalera = new String[rangoArray];
        for (int i = 0; i < rangoArray; i++) {
            //Imprimir el array P
            String arrayP = "P(" + i + ") = ";
            //Imprimir los valores de V separados por +
            String arrayV = "V(0)";
            for (int j = 1; j <= i; j++) {
                arrayV += " + V(" + j + ")";
            }
            //Guardar en un iterador
            escalera[i] = arrayP + arrayV;
        }
        //Coger informacion del iterador y devolver en forma de escalera
        for (String expresion : escalera) {
            System.out.println(expresion);
        }
    }
}
