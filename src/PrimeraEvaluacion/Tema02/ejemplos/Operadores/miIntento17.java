package PrimeraEvaluacion.Tema02.ejemplos.Operadores;

import java.util.Scanner;

public class miIntento17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();
        int num4 = teclado.nextInt();
        int suma = num1 + num2 + num3 + num4;
        System.out.println("Suma =" + suma);
        double  media = suma / 4.0; // se colocamos simplesmente 4 vai fazer fazer a divisao entre dois numeros inteiros.
        System.out.println("Media = " + media);

    }
}
