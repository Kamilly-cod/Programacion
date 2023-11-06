package PrimeraEvaluacion.Tema04.ejercicios;
/*
Ejercicio 5
Escribe un programa que compruebe si una cadena dada comienza por “J”, sin que tenga en cuenta si está en mayúsculas o minúsculas. El programa debe imprimir true o false.
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introce una cadena: ");
        String cadena = teclado.nextLine();
        String mayscula = cadena.toUpperCase();
        System.out.println(mayscula);

        boolean empiezaporJ = mayscula.startsWith("J");

    }
}
