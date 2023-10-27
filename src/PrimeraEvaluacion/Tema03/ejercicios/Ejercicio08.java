package PrimeraEvaluacion.Tema03.ejercicios;
/*
Escribe un programa que lea un año e indique si es bisiesto. Nota: un año es bisiesto si es divisible por 4, y no es divisible por 100, excepto (|| exceto) que también sea divisible por  400.
 */

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        if ( (num % 4== 0 && num % 100 != 0) || (num % 400 == 0) ) {
            System.out.println("Bisiesto");
        } else {
            System.out.println(" No bisiesto");
        }


    }
}
