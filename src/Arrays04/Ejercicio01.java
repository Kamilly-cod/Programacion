package Arrays04;
/*
Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los muestre en el mismo orden introducido.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        double a [];
        a = new double[5];
        Scanner teclado = new Scanner(System.in);

        for ( int i = 0; i < a.length ; i++) {
            double numero = teclado.nextDouble();
            System.out.println("Element de array: " + i );
            a[i] = numero;
            
        }
        System.out.println(Arrays.toString(a));

    }
}
