package PrimeraEvaluacion.Tema02.ejercicios.OperadoresEJ;
/*
Escribe un programa que lea tres números enteros e imprima true si el primer número está entre el segundo y el tercero (ambos inclusive). De lo contrario, debe imprimir false.
 */


import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();
        boolean resultado = (num1 >= num2) && (num1 <= num3) || (num1 <= num2) && (num1 >= num3);
        //System.out.println();
        System.out.println(resultado);


    }
}
