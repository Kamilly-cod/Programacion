package PrimeraEvaluacion.Tema04.ejercicios;

/*
Escribe un programa que lea una cadena y dos números enteros para indicar los límites inferior y superior respectivamente de un rango dentro de las posiciones de los caracteres de la cadena. Imprime la subcadena indicada por el rango:
a) suponiendo que ambos números siempres son mayores o iguales a 0 y menores que la longitud de la cadena;
b) Validando que sucede a).

 */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introce una cadena: ");
        String cadena;
        cadena = teclado.nextLine();

        int li, ls;
        li = -1;
        while (li <0 || li>cadena.length() -1 ) {
            System.out.print("Limite inferior: ");
            li = teclado.nextInt();
            if (li<0 || li>cadena.length() -1) { // se o número nao vale ja era
                System.out.println("El número introducido no puede ser menor que 0 ni mayor que " + ( cadena.length() -1));
            }
        }

        ls = -1;
        while (ls <0 || ls>cadena.length() -1 ) {
            System.out.print("Limite superior: ");
            ls = teclado.nextInt();
            if (ls<0 || ls>cadena.length() -1) { // se o número nao vale ja era
                System.out.println("El número introducido no puede ser menor que 0 ni mayor que " + ( cadena.length() -1));
            }
        }
        String subcadena = cadena.substring(li,ls);
        System.out.println(subcadena);


    }
}
