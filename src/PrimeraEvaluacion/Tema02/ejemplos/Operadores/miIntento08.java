package PrimeraEvaluacion.Tema02.ejemplos.Operadores;
/*
Escribe un programa que pida un número de dos cifras y muestre sus cifras invertidas.. Ejemplo, si se introduce 23 que muestre 32.
 */


import java.util.Scanner;

public class miIntento08 {
    public static void main(String[] args) {
        // Ecribir un numero de dos cifras
        Scanner teclado = new Scanner(System.in);
        System.out.println("INtroduce un numero de cifras: ");
        int numero = teclado.nextInt();
        // muestre sus cifras invertidas...
        int decenas = numero / 10;
        int unidades = numero % 10;
        System.out.println(unidades + "" + decenas);


    }
}
