package buclesAnidados;
/*
[FOR ANIDADO] Escribe un programa que, dado un número n introducido por teclado, dibuje un cuadrado de dimensiones n * n, con un carácter también introducido por teclado. Ejemplo:
 */

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un número");
        int num1 = teclado.nextInt(); teclado.nextLine();
        System.out.println("Escriba un carácter:");
        char caracter;
        caracter = teclado.nextLine().charAt(0);

            for (int i = 1; i <= num1; i++) {

                for (int j = 1; j <= num1; j++) {

                    System.out.print(caracter+ "\t");
                }
                System.out.println();
            }
        }
    }

