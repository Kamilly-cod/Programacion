import java.util.Arrays;
import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        Random generador = new Random();
        for (int i = 0; i < numeros.length ; i++) {
            numeros [i] = generador.nextInt(1,11);

        }
        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        int [] inverso = new int[numeros.length];
        for (int i = numeros.length - 1; i >= 0; i--) {
            inverso[i] = numeros[numeros.length - 1 - i];

        }
        System.out.println(Arrays.toString(inverso));
    }
}
