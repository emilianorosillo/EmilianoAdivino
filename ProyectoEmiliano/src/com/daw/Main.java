package com.daw;

/*
    CORREGIDO POR: SERGIO VAQUERO GARCIA.
    Funciona correctamente, el programa y descargar el proyecto.
*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 0, cont = 0;
        int min = 10, max = 50;
        int x = (int)(Math.random()*(max - min)) + min;
        System.out.println(x);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n Introduce el valor de X:");
            n = sc.nextInt();
            if(n > x) {
                System.out.println("Te pasaste wey!");
            } else if(n < x) {
                System.out.println("Uy! Casi... Sigue intentándolo!");
            }
            cont++;
        } while(n != x);
        System.out.println("Eso es! Has acertado con un total de " + cont + " intento/s. Nada mal!");
        sc.close();
    }
}
