package PrimeraEvaluacion.Tema02.ejemplos.Operadores;

/*
Escribe un programa que lea un valor entero n de la entrada estándar y muestre el resultado de la siguiente expresión aritmética:
((n + 1) * n + 2) * n + 3
 */

import java.util.Scanner;

public class miIntento03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        // podria crear una variable para guardar el valor de la expresion, o ponerla en el sout
        System.out.println(((n + 1) * n + 2) * n + 3); // introduciendo esta expresion SIN COMILLAS, se calcula directamente.
        //  System.out.println("((n + 1) * n + 2" +  ) * n + 3" + ((n + 1) * n + 2) * n + 3);
    }
}
