package OperacionesConIf;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite un número");
        int num = teclado.nextInt();
        if (num %2==0 ) {
            System.out.println("Ese número es par");
        }
        else {
            System.out.println("Es un número ímpar");

        }


    }
}
