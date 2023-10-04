package PrimeraEvaluacion.Tema02.ejemplos.Operadores2;
/*
Es un operator ternario que permite asignar un valor u otro a una variable en función de que se cumpla o no una condición. Es una forma reducida de utilizar una sentencia if .. else en casos específicos.

La síntaxis del operador es:

resultado = condicion ? valorSiVerdadero: valorSiFalso
 */


import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        // Provar se um número é par ou ímpar
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        String cadena = numero % 2 == 0 ? " es número par" : "Es número impar";
        // Se o resto nao for 0 ao dividir numeros entre dois, entao nao é par.
        System.out.println(numero + cadena);

        boolean resultado = numero % 2 == 0 ? true : false;
        System.out.println("¿Es par? " + resultado);


    }
}
