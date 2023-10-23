package While;

import java.util.Scanner;

public class Dowhile02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        int i;
       i = 1;
       do {
           if (i % 5 == 0) {
               System.out.println(i + " ");
           }
           i++;
       } while (i <= n);




    }
}


