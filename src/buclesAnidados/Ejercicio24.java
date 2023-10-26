package buclesAnidados;
/*
[FOR ANIDADO] Escribe un programa que reciba dos valores enteros por teclado, a y b, y dibuje un rectángulo en que la base sea el número mayor y la altura el número menor, con un carácter también introducido por teclado.
 */

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba dos números");
        int a = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Escriba otro números");
        int b = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Escriba un carácter:");
        char caracter;
        caracter = teclado.nextLine().charAt(0);

        if (a < b) {
            //
            for (int i = 1; i <= a; i++) {

                for (int j = 1; j <= b; j++) {

                    System.out.print(caracter + "\t");
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= b; i++) {

                for (int j = 1; j <= a; j++) {

                    System.out.print(caracter + "\t");
                }
                System.out.println();
            }
        }
    }
}