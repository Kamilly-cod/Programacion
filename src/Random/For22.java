package Random;

import java.util.Random;
import java.util.Scanner;
/*
Hacer un programa que genere 10 números aleatoriamente y calcule su media.
 */
public class For22 {
    public static void main(String[] args) {
      /*  Scanner teclado = new Scanner(System.in);
        System.out.println("");
        Random generador = new Random();
        int numeroAleatorio = generador.nextInt(10);

        for (int i=0; i <= 10; i++) {
            System.out.println(generador.nextInt(10) + "");

        }

        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();
        int num4 = teclado.nextInt();
        int suma = num1 + num2 + num3 + num4;
        System.out.println("Suma =" + suma);
        double  media = suma / 4.0; // se colocamos simplesmente 4 vai fazer fazer a divisao entre dois numeros inteiros.
        System.out.println("Media = " + media);
        */
        Random generador = new Random();
        int numeroAleatorio = generador.nextInt(10);
        //int array [] = {12,34,56,4,3,2,1,8,9,10};
        double media = 0.0;
        for (int i=0; i <= 10; i++) {
            media = media + numeroAleatorio;
        }
        System.out.print("Los numeros aleatorios son" +numeroAleatorio);
        media = media / numeroAleatorio;
        System.out.println("La media es " +media);




    }
}
