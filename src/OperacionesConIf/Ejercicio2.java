package OperacionesConIf;
/*
Escribe un programa que pida dos números e indique si el primero es mayor que el segundo o no.
 */


import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Me diz dois numeros gata");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();

        if (num1>num2) {
            System.out.println("O primeiro numero é maior que o primeiro");
        } else  {
            System.out.println("O segundo número é maior que o primeiro");
        }

    }
}
