package Swith;
/*

 */


import java.util.Scanner;

public class Ejercicio13If {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige dirección: \n1 - arriba\n2 - abajo\n3 - izquierda\n4 - derecha\n0 no mover");
        int direccion = teclado.nextInt();
        if (direccion ==1) {
            System.out.println("subir");
        }
        else if (direccion ==2) {
            System.out.println("bajar");

        }
        else if (direccion ==3) {
            System.out.println("mover a la izquierda");
        }
        else if (direccion ==4) {
            System.out.println("mover a la derecha");
        }
        else if (direccion ==0) {
            System.out.println("no mover");
        }
        else {
            System.out.println("¡¡Error¡¡");
        }

    }
}
