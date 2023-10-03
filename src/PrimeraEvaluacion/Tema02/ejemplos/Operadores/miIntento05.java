package PrimeraEvaluacion.Tema02.ejemplos.Operadores;

import java.util.Scanner;

public class miIntento05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int minutos = teclado.nextInt();

        int horas = minutos / 60;
        minutos = minutos % 60;
        System.out.println("Los minutos introduxidos se corresponden con " + horas + " horas" + " y " + minutos + " minutos");
    }
}
