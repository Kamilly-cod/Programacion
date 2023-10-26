package Swith_if;

import java.util.Scanner;

public class Ejercicio12If {
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
        if (casa == 1) { // si es "gryffindor", sale "valentía" ;
            System.out.println("Valentia");}
        else if (casa ==2) {
            System.out.println("Lealtad");
        }
        else if (casa ==3) {
            System.out.println("Astucia");
        }
        else if (casa ==4) {
            System.out.println("Intelecto");
        }
        else {
            System.out.println("No es una casa válida");
        }
    }
}
