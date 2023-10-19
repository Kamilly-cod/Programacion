package While;
/*
Escribe un programa que solicite al usuario un número entre 1 y 100, ambos inclusive. Si se introduce un número fuera del intervalo debe indicarlo mediante un error y seguir pidiendo el número hasta que se introduzca el número en el rango indicado. Al terminar debe imprimir por pantalla el número introducido.
 */

import java.util.Scanner;

public class Explicación03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (true) {
        System.out.println("Escriba un numero entre 0/100");
        int n = teclado.nextInt();
            if (n>= 1 && n<=100) {
                System.out.println( "Correcto ");
                break;
            } else  {
                System.out.println("Error");

            }

        }



    }
}
