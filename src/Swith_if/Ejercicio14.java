package Swith_if;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        String user = "dam1";
        String password = "Fernando6";

        Scanner teclado = new Scanner(System.in);
        System.out.print("Usuario: ");
        String usuario = teclado.nextLine();
        System.out.print("Contraseña: ");
        String contraseña = teclado.nextLine();

        if (usuario.equals(user) && password.equals(contraseña)) {
            System.out.println("Has entrado al sistema");
        }
        else if (usuario.equals(user) && !password.equals(contraseña)) {
            System.out.println("La contraseña es incorrecta");
        }
        else if (!usuario.equals(user) && password.equals(contraseña)) {
            System.out.println("El usuario es incorrecto");
        }
        else {
            System.out.println("Ni usuario ni contraseña son correctos");
        }


    }
}
