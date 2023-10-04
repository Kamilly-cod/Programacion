package PrimeraEvaluacion.Tema02.ejercicios.OperadoresEJ;
/*
Escribe un programa que lea un valor por teclado y verifique si es menor que 10. El programa debe imprimir un booleano (true o false).
 */


import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Analisaremos si los números son menor que 10. Indique un núemro");
        int numero = teclado.nextInt();
        boolean quiza = numero <10? true:false;
        System.out.println("¿El numero es menor que 10? " + quiza);

        //segunda forma
       // System.out.println("Segunda forma: con el operador ternario");



    }
}
