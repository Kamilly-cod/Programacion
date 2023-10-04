package PrimeraEvaluacion.Tema03.ejemplos;

import java.util.Scanner;

public class Ejemplosif {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Edad?");
        int edad = teclado.nextInt();
        if (edad >= 18) { // Aqui entra sólo si el resultado de la expresión es true
            System.out.println("Pasa, puedes ver la peli.");
        }
        ///... si es menor de edad nao acontece nada
        System.out.println("Esto se imprime siempre, tanto si es true como si es false.");
    }
}
