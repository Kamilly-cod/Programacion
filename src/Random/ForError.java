package Random;

import java.util.Scanner;

public class ForError {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();

        for (int i = 1; i<=num;i++) {
            num = num * i;
            System.out.println("El factorial del numero es:" +num);
        }
    }
}
