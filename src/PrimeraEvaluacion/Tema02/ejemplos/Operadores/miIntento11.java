package PrimeraEvaluacion.Tema02.ejemplos.Operadores;
/*
Realiza un programa que calcule la longitud de una circunferencia si nos dan el radio por teclado.
 */


import java.util.Scanner;

public class miIntento11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el radio de la circunferencia: ");
        double radio = teclado.nextDouble();
        // fórmula para calcular la longitude: 2* pi * r
        double longitud = 2 * Math.PI * radio; // Se colocar o punto no funciona

        System.out.print("La longitud seria " + longitud);


    }
}
