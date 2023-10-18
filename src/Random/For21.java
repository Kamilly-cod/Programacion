package Random;

import java.util.Scanner;

/*
Hacer el ejercicio anterior, pero sin asumir que el primer número es menor que el segundo. Es decir, pedir dos números enteros por teclado e imprimir la suma de todos los números enteros desde el menor hasta el mayor, ambos inclusive.
 */
public class For21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("a: ");
        int a = teclado.nextInt();
        System.out.print("b: ");
        int b = teclado.nextInt();

        int max;
        int min;
        if (a > b) {
             max = a;
             min = b;
        }else {
             max = b;
             min = a;
        }
        int suma = 0;
        for (int i = min; i <= max ; i++) {

            suma = suma +i;
        }
        System.out.println("La suma de los números desde " + min +" hasta " + max + " es igual " +suma);
    }
}
