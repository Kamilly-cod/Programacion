package While;

import java.util.Scanner;

public class Class33 {
    public static void main(String[] args) {
        System.out.println("Escriba tus números favoritos");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();

        int contador = 0;

        while (num !=0) {
            contador ++;
            num = teclado.nextInt();
        }
        System.out.println(contador+ " números introducidos");
    }
}
