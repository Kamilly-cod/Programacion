package PrimeraEvaluacion.Tema04.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena;
        cadena = teclado.nextLine();

        for (int i = 0 ; i <= cadena.length() -1 ; i++) {
            // o ultimo número da cadena é o tamanho que é cadena.length() - 1 que aí seria o indicé, porque começamos a contar com 0.
            // se coloca só i <= cadena.length dá error, porque o nunmero ia ser insuficiente
            System.out.println(cadena.charAt(i));
        }

    }
}
