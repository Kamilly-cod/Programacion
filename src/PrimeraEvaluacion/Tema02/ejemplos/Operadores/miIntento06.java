package PrimeraEvaluacion.Tema02.ejemplos.Operadores;
/*
Escribe un programa que reciba un tiempo en segundos y muestre por pantalla este tiempo pero expresado en horas, minutos y segundos. Por ejemplo, 12.610 segundos son 3 horas, 30 minutos y 10 segundos.
 */


import java.util.Scanner;

public class miIntento06 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int segundos = teclado.nextInt();
        int horas = segundos/3600;
        int minutos = segundos % 3600 / 60; // O puede ser int resto = segundos % 3600;
        // int minutos = resto / 60;
        int segundos1 = segundos % 60;
        System.out.println(segundos + " son " +horas+ " horas, " +minutos+ " minutos y " +segundos1+ " segundos");






    }
}
