package Arrays04;

import java.util.Arrays;
import java.util.Scanner;

/*
Realizar un programa que declare un array y lo vaya llenando de números intoducidos por teclado hasta que introduzcamos un número negativo. Entonces debe imprimir los elementos que contiene (el número negativo sólo sirve para finalizar el programa, no entra en el array).
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamaño = teclado.nextInt();
        // creo el array
        int[] array = new int[tamaño];
        System.out.println(Arrays.toString(array));
        // tengo que ir llenándose con nùmeros introducidos por teclado, pero sòlo si son positivos
        int numero = teclado.nextInt();
        int indice = 0;
        while (numero > 0 && indice < tamaño) {
            array[indice] = numero;
            // tengo que incrementar el indice a la siguiente posiciòn
            indice++;
            numero = teclado.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
