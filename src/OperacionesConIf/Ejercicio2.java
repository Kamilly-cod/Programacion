package OperacionesConIf;
/*
Escribe un programa que pida dos números e indique si el primero es mayor que el segundo o no.
 */


import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe un número entero");
        System.out.print("Escribe otro número entero");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();

        if (num1>num2) {
            System.out.println(num1+ " é maior que o primeiro " +num2);
        } else  {
            System.out.println(num1+ " es menor o igual que " +num2);
        }

    }
}
