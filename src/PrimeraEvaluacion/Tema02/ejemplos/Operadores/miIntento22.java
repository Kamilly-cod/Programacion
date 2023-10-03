package PrimeraEvaluacion.Tema02.ejemplos.Operadores;
/*
Haz el ejercicio anterior aplicando, además, un descuento del 15% sobre el total de la compra.
 */


import java.util.Scanner;

public class miIntento22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ponga aqui el precio del producto: ");
        double precio = teclado.nextDouble();

        System.out.println("Ponga aqui la cantidad de productos comprados: ");
        int productos = teclado.nextInt();

        System.out.println("Ponga aqui el IVA: ");
        double iva = teclado.nextDouble();

        //Aqui iremos hacer el calculo
        System.out.println("Veremos con el descuento");
        double descuento1 = teclado.nextDouble();

        double subTotal = productos * precio;
        double descuento2 = subTotal - (subTotal*descuento1) / 100;
        subTotal = descuento2;
        double Total = subTotal + (subTotal * iva) / 100;

        //   System.out.println(numero + " incrementado un " + porcentaje + "% es " + numeroIncre);
        //    double porcentajeCalc = numero * porcentaje / 100;

        System.out.printf("El total a pagar %.2f",  Total);
    }
}
