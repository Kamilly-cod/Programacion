package PrimeraEvaluacion.Tema02.ejemplos.Operadores;
/*
Realiza un programa que pida un número y un porcentaje, y
Calcule y muestre ese número incrementado en ese porcentaje.
Calcule y muestre ese número decrementado en ese porcentaje.
	Por ejemplo: si se introduce 10 y 20, el resultado es 12 y 8.
 */


import java.util.Scanner;

public class miIntento20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero");
        double numero = teclado.nextDouble();
        System.out.println("Porcentaje: ( por ejemplo, 20)");
        double porcentaje = teclado.nextDouble();
        double porcentajeCalc = numero * porcentaje / 100;
        System.out.println(" El " + porcentaje + " % de " + numero + " es " + porcentajeCalc);
        double numeroIncre = numero + porcentajeCalc;
        System.out.println(numero + " incrementado un " + porcentaje + "% es " + numeroIncre);
        double numDec = numero - porcentajeCalc;
        System.out.println(numero + " decrementado un " + porcentaje + " % es " + numDec);

    }
}
