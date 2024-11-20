package com.josehs.tema04.arrays;

import java.util.Random;

public class Ejercicio4 {
    /**
     *Generar 30 numeros double entre 0 y 10
     */
    public static Random random = new Random();
    public static void main(String[] args) {
        double [] notas = new double[30];
        for (int i = 0; i < notas.length; i++){
            notas[i] = random.nextDouble(0,10);
        }
        double contador = 0;
        for ( double numero : notas){
            contador += numero;
        }
        double media = contador / notas.length;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        String espacio = "";
        String coma = ",";
        for (int i = 0; i < notas.length; i++){
            if (i == notas.length -1){
                coma = "";
            }
            if (notas[i] >= 5) {
                sb.append(espacio).append(String.format("%.4f", notas[i])).append(coma);
            }
            if (i == 0){
                espacio = " ";
            }
        }
        sb.append("]");
        System.out.println(sb);
        System.out.printf("La media es: %1.4f",media);
    }

    /**
     *
     * @param valorMinimo
     * @param valorMaximo
     * @return
     */
    public static double aleatorio(double valorMinimo, double valorMaximo){
        Random random = new Random();
        return valorMinimo + random.nextDouble() * (valorMaximo - valorMinimo);
    }
}
