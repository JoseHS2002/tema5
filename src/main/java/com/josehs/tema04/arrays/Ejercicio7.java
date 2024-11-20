package com.josehs.tema04.arrays;

import java.util.Random;

public class Ejercicio7 {
    /**
     *
     * @param args
     */
    public static Random random = new Random();
    public static void main(String[] args) {
        int [] nRandom = new int[100];
        for (int i = 0; 100 > i; i++){
            nRandom[i] = random.nextInt(0,101);
        }
        pentagono(nRandom);
        nZero(nRandom);
        decagono(nRandom);
    }

    /**
     *
     * @param array
     */
    public static void pentagono(int [] array){
        for (int i = 0; array.length > i;i++){
            if (array[i] == 0){
                System.out.print("");
            } else if (array[i] % 5 == 0){
                System.out.println("Numero multiplo de 5= "+array[i]);
            }
        }
    }

    /**
     *
     * @param array
     */
    public static void nZero(int [] array){
        for (int i = 0; i < array.length;i++){
            if (array[i] == 0){
                System.out.println("0= "+array[i]);
            }
        }
    }

    /**
     *
     * @param array
     */
    public static void decagono(int [] array){
        for (int i = 0; array.length > i;i++){
            if (array[i] == 0){
                System.out.print("");
            } else if (array[i] % 10 == 0){
                System.out.println("Multiplo de 10= "+array[i]);
            }
        }
    }
}
