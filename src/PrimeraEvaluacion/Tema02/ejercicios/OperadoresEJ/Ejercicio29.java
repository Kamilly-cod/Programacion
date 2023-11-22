package PrimeraEvaluacion.Tema02.ejercicios.OperadoresEJ;
/*
Escribe un programa que lea tres números y compruebe que todos son diferentes, es decir, no iguales entre sí. El programa debe imprimir un booleano (true o false).
 */


import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int sorte1 = teclado.nextInt();
        int sorte2 = teclado.nextInt();
        int sorte3 = teclado.nextInt();

        boolean comparar = (sorte1 != sorte2) && (sorte1 != sorte2) && (sorte2 != sorte3);
        System.out.println(comparar);

    }

}
