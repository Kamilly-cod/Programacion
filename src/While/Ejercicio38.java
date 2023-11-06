package While;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char c = teclado.nextLine().charAt(0);
        while (c != ' ') {
        c = teclado.nextLine().charAt(0);
            if (c == 'a'|| c == 'e' || c=='i' || c=='o' || c =='u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                System.out.println();
            }

        }
    }
}
