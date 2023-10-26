package Swith_if;

import java.util.Scanner;

public class SwithTest12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Mostramos un menú para elegir la casa
        System.out.println("Elige una casa: ");
        System.out.println("1. gryffindor");
        System.out.println("2. hufflepuff");
        System.out.println("3. slytherin");
        System.out.println("4. ravenclaw");
        int casa = teclado.nextInt();
        // una vez selecionada una opción, escribimos una u otra cosa en función de esa opción
        switch (casa) {
            case 1:
                System.out.println("Valentia"); break;
            case 2:
                System.out.println("Lealtade"); break;
            case 3:
                System.out.println("Astucia"); break;
            case 4:
                System.out.println("Intelecto"); break;
            default:
                System.out.println("No posue ninguna casa");
        }

    }
}
