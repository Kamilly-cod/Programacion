package PrimeraEvaluacion.Tema02.ejemplos.Operadores;
/*
Realiza un programa que pida las notas de las tres evaluaciones del módulo Programación y muestre la nota final (la nota final es la media de las tres evaluaciones) con un decimal.
 */


import java.util.Scanner;

public class miIntento18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Primera evaluación: ");
        double num1 = teclado.nextDouble();
        System.out.println("Segunda evaluación: ");
        double num2 = teclado.nextDouble();
        System.out.println("Tercera evaluación: ");
        double num3 = teclado.nextDouble();
        double suma = num1 + num2 + num3 ;
        System.out.println("Suma =" + suma);
        double  media = suma / 3.0; // se colocamos simplesmente 4 vai fazer fazer a divisao entre dois numeros inteiros.
        System.out.printf("NOta final = %.1f ", media);
    }
}
