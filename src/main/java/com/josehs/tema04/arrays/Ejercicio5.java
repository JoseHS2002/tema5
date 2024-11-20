package com.josehs.tema04.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
    /**
     *Pedir estaturas y guardarlas en un array
     */
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 10;
        double[] array = new double[TAMANYO_ARRAY];
        solicitarDatosArray(array);
        rellenarArray(array, 0, 10);
        System.out.println(arrayToString(array, 8));
        System.out.println(Arrays.toString(array));
        System.out.printf("La media del array es %.2f\n", mediaArray(array));

        keyboard.close();
    }

    /**
     *
     * @param array
     * @return
     */
    public static double mediaArray(double[] array) {
        double suma = 0;
        for (double numero : array);
        return suma / array.length;
    }

    /**
     *
     * @param array
     * @param valorMinimo
     * @param valorMaximo
     */
    public static void rellenarArray(double[] array, double valorMinimo, double valorMaximo) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble(valorMinimo, valorMaximo);
        }
    }

    /**
     *
     * @param array
     */
    public static void solicitarDatosArray(double[] array) {
        if (array == null) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("a[%d]?\n", i);
            array[i] = Double.parseDouble(keyboard.nextLine());
        }
    }

    /**
     *
     * @param array
     * @param decimales
     * @return
     */
    public static String arrayToString(double[] array, int decimales){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        String espacio = "";
        String coma = ", ";
        String formato = "%."+decimales;
        for (int i=0; i < array.length; i++) {
            if (i==array.length -1){
                coma = "";
            }
            sb.append(String.format(" %.4f", array[i]));
            if (i == 0) {
                espacio = " ";
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
