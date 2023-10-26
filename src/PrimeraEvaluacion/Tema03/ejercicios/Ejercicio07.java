package PrimeraEvaluacion.Tema03.ejercicios;
/*
A las marmotas les gusta organizar fiestas, y en sus fiestas les gusta comer tazas de mantequilla de cacahuete. Pero no debe haber muchas, porque si no enferman. Una fiesta de la marmota exitosa tiene entre 10 y 20 tazas de mantequilla de cacahuete, ambas inclusive, a menos que sea fin de semana, en cuyo caso necesitarán de 15 a 25 tazas.
Escribe un programa que lea dos valores:
El primero es el número de tazas de mantequilla de cacahuete que hay en la fiesta.
El segundo es un booleano que indica si es fin de semana.
El programa debe imprimir si la fiesta tiene éxito o no (true o false).

 */

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        // leer dos valores
        Scanner teclado = new Scanner(System.in);
        int tazas = teclado.nextInt();
        boolean finde = teclado.nextBoolean();
        boolean éxito = false;
        //&&= e, and, y
        //||= ou. o. else, si no.

        if ((finde && tazas >= 15 && tazas <= 25) ||  (!finde && tazas >=10 && tazas <=20)) {
            éxito = true;
        }
        System.out.println(éxito);
    }
}
