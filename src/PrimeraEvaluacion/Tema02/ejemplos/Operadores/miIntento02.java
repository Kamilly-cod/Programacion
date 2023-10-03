package PrimeraEvaluacion.Tema02.ejemplos.Operadores;

import java.util.Scanner;

public class miIntento02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce cuatro números enteros: ");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();
        int num4 = teclado.nextInt();

        int suma = num1 + num2;
        int producto = num3 * num4;
        System.out.println("La suma de los dos primeros números es " + suma);
        System.out.println("El producto del tercer y el cuarto número es " + producto);
    }
}
