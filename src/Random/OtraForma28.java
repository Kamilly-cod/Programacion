package Random;

import java.util.Scanner;

public class OtraForma28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        // pegamos com um for todos os números inteiros entre 0 e n.
        for (int i = 5; i<= num; i = i + 5) {
                System.out.print(i + " ");
            }
        }
    }
