package Swith_if;
/*
Escribe un programa que pida dos números enteros, y pida la operación que quiere realizar con estos (+, -, *, /). El programa debe realizar la operación pedida y visualizar el resultado. En caso de que el símbolo introducido no sea correcto, visualizar: operación incorrecta.
 */

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba dos números enteros");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        teclado.nextLine(); // para que funcione el siguiente nextLine ()
        System.out.println("Operación a realizar: +, -, *, /");
        char operación = teclado.nextLine().charAt(0);
        switch (operación) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case  '-':
                System.out.println(num1+ " - " + num2 + " = " + (num1-num2));
                break;
            case  '*':
                System.out.println(num1+ " * " + num2 + " = " + (num1*num2));
                break;
            case '/':
                System.out.println(num1+ " / "+ num2 + " = " + (num1/num2));
                break;
            default:
                System.out.println("Error");

        }



    }
}
