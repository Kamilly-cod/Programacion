package PrimeraEvaluacion.Tema04.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena, texto;

        cadena = teclado.nextLine();
        System.out.print("Ahora introduce el texto que quieres comprobar si está: ");
        texto= teclado.nextLine();

        if (cadena.contains(texto)) {
            System.out.println("Si, el texto \"" + texto + "\"está dentro de " + cadena + " \" " );
        }



    }
}
