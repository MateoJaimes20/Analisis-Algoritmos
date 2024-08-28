package com.mycompany.autoarray;

import java.util.Random;

public class AutoArray {

    public static void main(String[] args) {
        int filas = 50;
        int columnas = 50;
        
        long startTime = System.currentTimeMillis();
        
        int[][] matriz = new int[filas][columnas];
        
        Random random = new Random();
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        long endTime = System.currentTimeMillis();
        
        long printDuration = endTime - startTime;
        
        System.out.println("Tiempo para imprimir la Matriz: "+ printDuration+"ms");
    }
}