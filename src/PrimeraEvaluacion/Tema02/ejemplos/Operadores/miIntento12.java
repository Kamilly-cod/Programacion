package PrimeraEvaluacion.Tema02.ejemplos.Operadores;
/*
Realiza un programa que calcule el área de una circunferencia introduciendo el radio por teclado.

 */


import java.util.Scanner;

public class miIntento12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el radio de la circunferencia: ");
        double radio = teclado.nextDouble();
        // fórmula para calcular la longitude: pi * r²
        double longitud = Math.PI *  Math.pow(radio, 2); // Se colocar o punto no funciona

        System.out.printf("La longitud seria %.2f", longitud); // se quiseres colocolar só dois decimales tem que colocar %.2f, y despues la resposta.

    }
}
