package PrimeraEvaluacion.Tema02.ejemplos.Operadores;
/*
Escribe un programa que pida un número de dos dígitos e imprima las decenas.
 */


import java.util.Scanner;

public class miIntento07 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); // siempre cuando pide para el usuario digitar algo.
        System.out.println("Escriba dos dígitos");
        int numero = teclado.nextInt();
        System.out.println(numero);
        int decenas = numero / 10;
        int unidades = numero % 10;






    }
}
