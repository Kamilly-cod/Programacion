package PrimeraEvaluacion.Tema03.ejercicios;
/*
Realizar un programa que pida números (al arrancar el programa se pedirá por teclado la cantidad de números a introducir). El programa debe informar de cuántos números introducidos son mayores que 0, menores que 0 e iguales a 0.
 */

import java.util.Random;
import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Escriba números a introducir");

        int num = tecla.nextInt();


        for (double i = 0; i < num ; i++) {
            num = rnd.nextInt(-10,11);
            System.out.print(num+ " ");

            if (num > 0) {
                System.out.println("m");
            } else if (num < 0) {
                System.out.println("n");
            } else if (num == 0) {
                System.out.println("o");
            } else {
                System.out.println("p");
            }
        }

    }
}
