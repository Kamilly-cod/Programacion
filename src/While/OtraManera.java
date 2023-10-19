package While;

import java.util.Scanner;

public class OtraManera {
    public static void main(String[] args) {
        System.out.println("Introduce un número entre 1 y 100 ( ambos inclusive ):");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        if (numero < 1 || numero > 100) {
            System.out.println("EL número está fuera del rango. \nPor favor, introduce un número entre 1 y 100");
            numero = teclado.nextInt(); // esta viene a ser como la i que incrementamos como la i++ mas adpatada, a i++ trocou de roupa, nova pessoa
        }
    }
}
