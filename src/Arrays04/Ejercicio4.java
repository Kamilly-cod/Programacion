package Arrays04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamaño = teclado.nextInt();
        int [] numeros = new int [tamaño];

        Random generador = new Random();
        for (int i = 0; i < numeros.length ; i++) {
            numeros[i] = generador.nextInt(1,11);

        }

        System.out.println(Arrays.toString(numeros));

        int suma = 0;
        for (int i = 0; i < numeros.length ; i++) {
            suma += numeros[i];
        }
        System.out.println("Suma = " +suma);

    }
}
