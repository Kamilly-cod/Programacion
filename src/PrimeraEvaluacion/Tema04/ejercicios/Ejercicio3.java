package PrimeraEvaluacion.Tema04.ejercicios;

/*
Ejercicio 3
Escribe un programa que lea una cadena de texto y reemplace todas las ocurrencias de la letra ‘a’ con la letra ‘b’. A continuación debe imprimir la cadena resultante.
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");

        String cadena = "banana";


        System.out.println("Vamos mudar o a por b da palabra banana: "  + cadena.replace("a","b"));

    }
}
