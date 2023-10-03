package PrimeraEvaluacion.Tema02.ejemplos.Operadores;
/*
Escribe un programa que lea un número de tres cifras y muestre el número invertido. Por ejemplo: si introducimos el número 320, el programa debe mostrar 23; si introducimos 976, el programa debe mostrar 679.
 */


import java.util.Scanner;

public class miIntento09 {
    public static void main(String[] args) {
        // Escribe un programa que les un número de tres cifras
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        // y muestre el número invertido
        int centenas = numero / 100;
        int resto = numero % 100;
        int decenas = resto / 10;
        int unidades = resto % 10;

        // mostramos los tres digitos invertidos
        System.out.println(unidades + "" + decenas + "" + centenas);

    }
}
