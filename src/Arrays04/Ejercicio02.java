package Arrays04;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        double a [];
        a = new double[5];
        Scanner teclado = new Scanner(System.in);

        for ( int i = 0; i < a.length ; i++) {
            double numero = teclado.nextDouble();
            a[i] = numero;

        }
        for (int i =  a.length - 1; i>= 0 ; i--) {
            System.out.print(a[i] + " ");

        }

    }
}
