package While;

import java.util.Scanner;

public class Class34 {
    public static void main(String[] args) {
        System.out.println("Escriba tus números favoritos");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int contador = 0;
        double suma1 = 0;
        while (num !=0) {
            contador ++;
            suma1 = suma1 + num;

            num = teclado.nextInt();
        }
        double media = suma1/contador;
        System.out.printf("Media; %.2f", +media);
    }
}
