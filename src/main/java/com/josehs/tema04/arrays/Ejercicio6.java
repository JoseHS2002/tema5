package com.josehs.tema04.arrays;

import java.util.Random;
import java.util.Arrays;

public class Ejercicio6 {
    /**
     * Generar dos arrays de 10 elementos, sumarlos y dividirlos
     */
    public static Random random = new Random();
    public static void main(String[] args) {
        int [] arrayX = new int[10];
        int [] arrayY = new int[10];
        for (int i = 0; i < arrayX.length; i++){
            arrayX[i] = random.nextInt(0,10);
        }
        for (int i = 0; i < arrayY.length; i++){
            arrayY[i] = random.nextInt(0,10);
        }
        System.out.println("Primer array: "+Arrays.toString(arrayX));
        System.out.println("Segundo array: "+Arrays.toString(arrayY));
        System.out.println("Suma: "+Arrays.toString(sumarArrays(arrayX,arrayY)));
        System.out.println("Division: "+Arrays.toString(dividirArrays(arrayX,arrayY)));
    }

    /**
     *
     * @param arrayX
     * @param arrayY
     * @return
     */
    public static float [] dividirArrays(int [] arrayX, int [] arrayY){
        float [] arrayDivision = new float[10];
        for (int i = 0; i < arrayX.length; i++){
            arrayDivision[i] = (float) arrayX[i] / arrayY[i];
        }
        return arrayDivision;
    }

    /**
     *
     * @param arrayX
     * @param arrayY
     * @return
     */
    public static int [] sumarArrays(int [] arrayX, int [] arrayY){
        int [] arraySuma = new int[10];
        for (int i = 0; i < arrayX.length; i++){
            arraySuma[i] = arrayX[i] + arrayY[i];
        }
        return arraySuma;
    }
}

