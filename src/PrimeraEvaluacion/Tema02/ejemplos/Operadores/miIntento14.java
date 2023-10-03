package PrimeraEvaluacion.Tema02.ejemplos.Operadores;

import java.util.Scanner;

public class miIntento14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Base: ");
        double base = teclado.nextDouble();
        System.out.print("ALtura: ");
        double altura = teclado.nextDouble();
        double area = base * altura / 2;

        System.out.println("Area del triangulo = " + area);

    }
}
