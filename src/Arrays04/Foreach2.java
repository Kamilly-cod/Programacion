package Arrays04;

import java.util.Arrays;

public class Foreach2 {
    public static void main(String[] args) {
        String cadena = "Hoje cedo quando eu acordei e nao te vi, eu pensei em tantas coisas aaa, tive medo ah, quase chorei";
        char[] letras = cadena.toCharArray();

        // se quero meter toda a
        int[] contadores = new int[5];
        System.out.println("cadena tine" + letras.length + " carcacteres " + Arrays.toString(letras));
        //contador[0] = a
        //contador[1] = b
        //contador[2] = c
        //contador[3] = d
        //contador[4] = e
        //contador[5] = f
        for (char recolhe1 : letras) {
            if (recolhe1 == 'a') {
                contadores[0] = contadores[0] + 1;
            } else if (recolhe1 == 'e') {
                contadores [1]++;

            } else if (recolhe1 == 'i') {
                contadores [2]++;

            } else if (recolhe1 == 'o') {
                contadores [3]++;
            } else if (recolhe1 == 'u') {
                contadores [4]++;

            }
        }
        System.out.println("numero de \'a\':" + contadores[0]);
        System.out.println("numero de \'e\':" + contadores[1]);
        System.out.println("numero de \'i\':" + contadores[2]);
        System.out.println("numero de \'o\':" + contadores[3]);
        System.out.println("numero de \'u\':" + contadores[4]);
    }
}
