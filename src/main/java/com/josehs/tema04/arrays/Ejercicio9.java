package com.josehs.tema04.arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {

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
                crearArray();
            }else if(n==2){
                visualizarArray();
            }else if(n==3){
                visualizarPares();
            }else if(n==4){
                visualizarMultiplos3();
            }
        } while(n != 0);
    }
    public static void crearArray(int [] array) {
        Random random = new Random();
        int[] array = new int[arrays];
        for (int i = 0; i < arrays; i++) {
            array[i] = random.nextInt(51);
        }
        return array;
    }
    }
    public static void visualizarArray(int [] array) {
        System.out.println("Contenido del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void visualizarPares(int [] array) {
        System.out.println("Elementos pares del array:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Posición: " + i + ", Valor: " + array[i]);
            }
        }
    }
    public static void visualizarMultiplos3(int [] array) {
        System.out.println("Elementos múltiplos de 3 del array:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println("Posición: " + i + ", Valor: " + array[i]);
            }
        }
    }
}
