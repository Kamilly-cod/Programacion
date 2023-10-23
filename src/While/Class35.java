package While;

import java.util.Random;
import java.util.Scanner;

/*
Dada una secuencia de números enteros (que finaliza con el número 0), encuentra el elemento más grande de la secuencia. El número 0 no está incluido en la secuencia, sólo se utiliza para finalizar el programa. Los números son introducidos por teclado.
 */
public class Class35 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int mayor=n;

        while (n !=0 ) {
            n= teclado.nextInt();
            if (n>mayor && n!=0) { // metemos o n !=0 pq se os números fossem negativos vai ser o número mais perto do 0
                mayor = n;
            }

        }
        System.out.println(mayor);

    }
}
