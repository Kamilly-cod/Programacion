package PrimeraEvaluacion.Tema02.ejercicios.OperadoresEJ;
/*Escribe un programa que lea los números a, b y c y compruebe si existe algún par de ellos que sumen exactamente 20. El programa debe imprimir un booleano (true o false).
 */


import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();

      /*  boolean comparar = (sorte1 != sorte2) && (sorte1 != sorte2) && (sorte2 != sorte3);
        System.out.println(comparar);*/


        if ((a + b == 20) || (a + c == 20) || ( b + c == 20)) {
        System.out.println(true);}
        else  {
            System.out.println(false);
        }


    }
}
