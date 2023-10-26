package Swith_if;

import java.util.Scanner;

public class SwithTest13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige dirección: \n1 - arriba\n2 - abajo\n3 - izquierda\n4 - derecha\n0 no mover");

        int acción = teclado.nextInt();
        //break es como jump que pula para o proximo exercicio se caso nao coloca ele vai direto.

        switch (acción) {
            case 1:
                System.out.println("subir"); break;
            case 2:
                System.out.println("bajar"); break;
            case 3:
                System.out.println("Se mueva a la izquierda"); break;
            case 4:
                System.out.println("Se mueva a la derecha"); break;
            case 0:
                System.out.println("No se mueva"); break;
            default:
                System.out.println("¡¡Error¡¡");
        }
    }
}
