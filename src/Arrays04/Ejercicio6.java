package Arrays04;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt(); teclado.nextLine(); // para que a informaçao nao se perca al meter um string

        String[] cadenas = new String[n];

        for (int i = 0; i < cadenas.length; i++) {
            cadenas[i] = teclado.nextLine();

        }
        System.out.println(Arrays.toString(cadenas));
    }

}
