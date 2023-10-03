package PrimeraEvaluacion.Tema02.ejemplos.Variables;

import java.util.Scanner;

public class Ejemplo04 {
    public static void main(String[] args) {
        // VAmos a ver cómo se introducen los datos por teclado
        Scanner teclado = new Scanner(System.in); // Scanea todas las informaciones para que el ordenador pueda mirar
        System.out.println("Escribe tu nombre");
        // escribimos el nombre por teclado y los guardamos en una variable
        String nombre = teclado.nextLine();
        System.out.println("Hola, " + nombre);

    }
}
