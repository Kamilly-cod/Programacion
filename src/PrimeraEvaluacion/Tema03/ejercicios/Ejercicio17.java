package PrimeraEvaluacion.Tema03.ejercicios;
/*
Escribe un programa que responda a un usuario que quiere comprar un helado en una conocida marca de comida rápida cuanto le costará en función del topping que elija.
El helado sin topping cuesta 1.90€.
El topping de oreo cuesta 1€.
El topping de KitKat cuesta 1.50€.
El topping de brownie cuesta 0.75€.
El topping de lacasitos cuesta 0.95€.
En caso de no disponer del topping solicitado por el usuario el programa escribirá por pantalla «no tenemos este topping, lo sentimos. » y a continuación informará del precio del helado sin ningún topping.
Finalmente, el programa escribe por pantalla el precio del helado resultante.

 */

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige una opción:\n" +
                "1-El helado sin topping cuesta 1.90€.\n" +
                "2-El topping de oreo cuesta 1€.\n" +
                "3-El topping de KitKat cuesta 1.50€.\n" +
                "4-El topping de brownie cuesta 0.75€.\n" +
                "5-El topping de lacasitos cuesta 0.95€.");
        int topping = teclado.nextInt();
        final double PRECIO_BÁSICO = 1.9;
        double precioConTopping = PRECIO_BÁSICO;

        switch (topping) {
            case 1:
        }


    }
}
