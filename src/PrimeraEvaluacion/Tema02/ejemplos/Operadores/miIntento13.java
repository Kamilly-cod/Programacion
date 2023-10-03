package PrimeraEvaluacion.Tema02.ejemplos.Operadores;
/*
Realiza un programa que pida el lado de un cuadrado, y muestre por pantalla su perímetro.
 */


import java.util.Scanner;

public class miIntento13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el lado de un cuadrado: ");
        double lado = teclado.nextDouble();
        // fórmula para calcular la longitude: 4 * L
        double perimetro = 4 * lado ; // Se colocar o punto no funciona

        System.out.printf("El perimetro seria %.2f", perimetro); // se quiseres colocolar só dois decimales tem que colocar %.2f, y despues la resposta.

    }
}
