package P93;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        int casos = teclado.nextInt(); teclado.nextLine();


        for (int i = 0; i < casos; i++) {
            String linea = teclado.nextLine();
            String [] elementos = linea.split(  " ");

            int[] numeros = new int[5];
            for (int j = 0; j < 5; j++) {
                numeros[j] = Integer.parseInt(elementos[j]);

            }

           int result= ( (numeros[0]*6) + (numeros[1]*8) + (numeros[2]*10) + (numeros[3]*numeros[4]) * 2);
            System.out.println(result);

        }
        teclado.close();


    }
}
