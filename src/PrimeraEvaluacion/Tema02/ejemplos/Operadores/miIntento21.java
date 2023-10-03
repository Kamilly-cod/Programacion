package PrimeraEvaluacion.Tema02.ejemplos.Operadores;
/*
Realiza un programa que pida el precio de venta de un producto, la cantidad de productos comprados y el porcentaje de IVA aplicado. El programa mostrará el importe total a abonar.
 */


import java.util.Scanner;

public class miIntento21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ponga aqui el precio del producto: ");
        double precio = teclado.nextDouble();

        System.out.println("Ponga aqui la cantidad de productos comprados: ");
        int productos = teclado.nextInt();

        System.out.println("Ponga aqui el IVA: ");
        double iva = teclado.nextDouble();

        //Aqui iremos hacer el calculo
        double subTotal = productos * precio;
        double Total = subTotal + (subTotal * iva) / 100;
     //   System.out.println(numero + " incrementado un " + porcentaje + "% es " + numeroIncre);
    //    double porcentajeCalc = numero * porcentaje / 100;

        System.out.println("El total a pagar " + Total);


    }


}
