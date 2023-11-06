package Arrays04;
/*
Arrays, disposión
 */

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {
        double alumno1 = 5.5;
        double alumno2 = 8.5;

        double[] notas = {6,5,4,8,10,3,7,7,5,5};
        System.out.println(notas[0]);
        System.out.println(notas[notas.length-1]);
        System.out.println(notas.length); // cuantos números tem no array
        notas[0] = 7;
        System.out.println(notas[0]);

        // ***formas de preencher***
        // uma é a da linha 15; a declaro (la declaro, poq estou me referindo a linha) e enumero os dados em ordem dentro de {}
        // o mais normal é nao saiba os dados antes de declarar eles
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
        numeros[i] = i;
        }
        // Como imprimir todos os elementos de array?
        //Opción A: com for

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");

        }
        System.out.println("");
        System.out.println(Arrays.toString(numeros));

    }
}
