package PrimeraEvaluacion.Tema02.ejercicios.OperadoresEJ;
/*
Escribe un programa que lea un valor entero y verifique si es menor que 10 y mayor que 0. El programa debe imprimir un booleano (true o false).
 */


import java.util.Scanner;

public class Operadores27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();
        boolean menorzinho = valor < 10 && valor > 0; // 0 < valor < 10 --> no se puede poner así.
        System.out.println("Es menor que 10 y mayor que 0: " + menorzinho);



    }
}
