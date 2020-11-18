package com.daw;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 0, cont = 0;
        int x = (int)(500*Math.random());
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
