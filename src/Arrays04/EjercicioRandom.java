package Arrays04;

import java.util.Arrays;
import java.util.Random;

public class EjercicioRandom {
    public static void main(String[] args) {
        int[] numerosenteros = new int[100];
        int max = 1000;
        int min = -1000;
        Random generador = new Random();

        for (int i = 0; i < numerosenteros.length; i++) {
            numerosenteros[i] = generador.nextInt(min,max + 1);

        }
        System.out.println(Arrays.toString(numerosenteros));
        Arrays.sort(numerosenteros);
        System.out.println(Arrays.toString(numerosenteros));
    }
}
