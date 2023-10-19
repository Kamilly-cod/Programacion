package While;

import java.util.Scanner;

public class Explicación02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int i = n;
        i = 1;

        while (i<=n) {

            if ( i % 5 == 0 ) {
                System.out.print( i + " ");
            }

            i++;
        }

    }
}
