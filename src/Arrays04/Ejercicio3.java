package Arrays04;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        int [] a1 = new int [5];
        int [] a2 = new int [5];
        int [] a3 = new int [5];

        Random generador = new Random();
        for (int i = 0; i < a1.length ; i++) { // como os dois tem o mesmo tamanho a gente coloca junto, mas se fosse diferente melhor colocar em outro for.
            a1[i] = generador.nextInt(1,11);
            a2[i] = generador.nextInt(1,11);

        }
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        // coloque os elementos de a3 así : a3=a1+a2
        for (int i = 0; i < a3.length ; i++) {
            a3 [i] = a1 [i] + a2 [i];


        }
        System.out.println(Arrays.toString(a3));
    }
}
