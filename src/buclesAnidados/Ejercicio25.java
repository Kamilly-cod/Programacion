package buclesAnidados;
/*
[FOR ANIDADO]Hacer un programa que introduzca un número entero, positivo, y calcule su tabla de multiplicar, hasta llegar a él. (Nota: para  que los números queden alineados en columnas puedes usar el tabulador \t). Ejemplo:
 */

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Escriba un número entero");
        int num1 = tec.nextInt();

        for (int i = 1;i <= num1; i++) {
            System.out.print("Tabla del" + i + ":");
            for (int j = 1; j < 11; j++) {
                System.out.print((i * j)+ "\t");
            }System.out.println();
        }


    }
}
