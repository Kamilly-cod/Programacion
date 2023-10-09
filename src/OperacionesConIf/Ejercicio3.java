package OperacionesConIf;
/*
Escribe un programa que pide 5 números por teclado y al concluir escribe el mayor y menor de ellos (sin utilizar for).
 */


import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int menorTemporal;
        int mayorTemporal;

        {

        }
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un número entero");
        int num1 = teclado.nextInt();
        mayorTemporal = num1;
        menorTemporal = num1;

        System.out.println("Escriba otro número entero");
        int num2 = teclado.nextInt();
        if (num2 > mayorTemporal) {
            mayorTemporal = num2;
        }

        System.out.println("Escriba otro número entero");
        int num3 = teclado.nextInt();
        if (num3> mayorTemporal) {
            mayorTemporal = num3;
        }


        System.out.println("Escriba otro número entero");
        int num4 = teclado.nextInt();
        if (num4 > mayorTemporal) {
            mayorTemporal = num4;
        }


        System.out.println("Escriba otro número entero");
        int num5 = teclado.nextInt();
        if (num5 > mayorTemporal) {
            mayorTemporal = num5;
        }
        System.out.println("El número mayor es " +mayorTemporal);

        if (num2 < menorTemporal) {
            menorTemporal = num2;
        }
        if (num3 < menorTemporal) {
            menorTemporal = num3;
        }
        if (num4 < menorTemporal) {
            menorTemporal = num4;
        }
        if (num5 < menorTemporal ) {
            menorTemporal = num5;
        }
        System.out.println("El número menor es " +menorTemporal);


    }
}
