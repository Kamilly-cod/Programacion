package Random;

import java.util.Scanner;

public class For28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        // pegamos com um for todos os números inteiros entre 0 e n.
        for (int i = 1; i<= num; i++) {
           // num = num * i;
           // se i é multiplo de 5 faz um if.
           if ( i % 5 == 0) {
               System.out.print(i + " ");
           }

        }


       // teclado.close();

    }
}
