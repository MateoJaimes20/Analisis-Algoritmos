package com.mycompany.perfectnumber;
public class PerfectNumber {

    public static boolean esPerfecto(int numero) {
        int sumaDivisores = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores == numero;
    }
    
    public static void main(String[] args) {   
        
        long startTime = System.nanoTime();
        
        System.out.println("Digite un número:");
        int numero =54;
        
        if (esPerfecto(numero)) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }

        long endTime = System.nanoTime();

        long duracion = endTime - startTime;
        
        System.out.println("El tiempo transcurrido es: " + duracion);
    }
}
