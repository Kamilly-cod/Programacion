package PrimeraEvaluacion.Tema02.ejercicios.OperadoresEJ;

import java.util.Scanner;

/*
Un alumno desea saber cual será su nota final en un módulo. Dicha calificación se compone de los siguientes porcentajes:
El 55% se obtiene del promedio de la nota de las tres evaluaciones..
El 30% se obtiene de la nota en un examen final.
El 15% se obtiene de de la calificación de un trabajo final.

 */
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("1ª evaluación de programacion: ");
        int ev1 = teclado.nextInt();
        System.out.println("2ª evaluación de programacion: ");
        int ev2 = teclado.nextInt();
        System.out.println("3ª evaluación de programacion : ");
        int ev3 = teclado.nextInt();
        System.out.println("Examen de programacion : ");
        int examen = teclado.nextInt();
        System.out.println("Trabajo de programación : ");
        int trabajo = teclado.nextInt();

        double evaluciones = ev1 + ev2 + ev3 / 0.55;
        double NExamen = examen / 0.3;
        double Ntrabajo = trabajo / 0.15;
        double notaF = evaluciones+NExamen+Ntrabajo / 3;

        System.out.printf("Nota final %2f", notaF);


    }
}
