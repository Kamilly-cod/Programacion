package PrimeraEvaluacion.Tema02.ejemplos.Operadores;

/*
Pide al usuario dos pares de números x1,y1 y x2,y2, que representen dos puntos en el plano. Calcula y muestra la distancia entre ellos. (https://www.geometriaanalitica.info/formula-de-la-distancia-entre-dos-puntos-geometria-ejemplos-y-ejercicios-resueltos/ )
 */

import java.util.Scanner;

public class miIntento16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca x1:");
        double x1 = teclado.nextDouble();
        System.out.print("Introduzca y1:");
        double y1 = teclado.nextDouble();
        System.out.print("Introduzca x2:");
        double x2 = teclado.nextDouble();
        System.out.print("Introduzca y2:");
        double y2 = teclado.nextDouble();

        // Calculo de vetor
        double result1 = x2 - x1;
        double result2 = y2 - y1;
        double result3 = Math.pow(result1,2);
        double result4 = Math.pow(result2,2);
        double result5 = Math.sqrt(result3 + result4);
        //  double longitud = Math.PI *  Math.pow(radio, 2); // Se colocar o punto no funciona
       System.out.println("Ls distancia entre (" +x1 + "," + y1 + ") y (" + x2 + "," + y2 + ") es " +result5);
       // System.out.printf("La distancia entre (%.2f, %.2f) y (%.2f, %.2f) es %.2f, %.2f");







    }


}
