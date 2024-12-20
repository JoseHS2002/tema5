package com.josehs.tema04.arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {
    public static Scanner keyboard = new Scanner(System.in);
    public static Random random = new Random();
    public static void main(String[] args) {
        int[] array = new int[50];
        int n;

        do{
            System.out.println("Menú principal");
            System.out.println("==============");
            System.out.println("1. Rellenar array.");
            System.out.println("2. Visualizar contenido del array");
            System.out.println("3. Visualizar contenido par.");
            System.out.println("4. Visualizar contenido múltiplo de tres.");
            System.out.println("0. Salir");
            System.out.println("Selecciona una opcion: ");
            n = Integer.parseInt(keyboard.nextLine());
            if(n==1){
                crearArray(array);
            }else if(n==2){
                visualizarArray(array);
            }else if(n==3){
                visualizarPares(array);
            }else if(n==4){
                visualizarMultiplos3(array);
            }
        } while(n != 0);
    }

    /**
     * Crea un array con numeros aleatorios del 0 al 50
     * @param array
     */
    public static void crearArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(51);
        }
    }

    /**
     * Visualizar el contenido del metodo crearArray
     * @param array
     */
    public static void visualizarArray(int [] array) {
        System.out.println("Contenido del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * Mostrar posicion y contenido de los elementos pares del metodo crearArray
     * @param array
     */
    public static void visualizarPares(int [] array) {
        System.out.println("Elementos pares del array:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Posición: " + i + ", Valor: " + array[i]);
            }
        }
    }

    /**
     * Mostrar posicion y contenido de los elementos del metodo crearArray que sean multiplos de 3
     * @param array
     */
    public static void visualizarMultiplos3(int [] array) {
        System.out.println("Elementos múltiplos de 3 del array:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println("Posición: " + i + ", Valor: " + array[i]);
            }
        }
    }
}
