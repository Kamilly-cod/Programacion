package Arrays04;
/*
FAÇA UM PROGRAM,A QUE REASLIZE O SEGUINTE:
ÇCRIE UM ARRAY BIDIMENSIONAL DE 5*5 ENTEROS, COM VALORES NUMERIVCOS.
SOMA TODOS OS ELEMENTOS DE CADA FILA E TODOS OS ELEMENTOS DE CADA COPLUMNA VISUALISANDO OS RESULTADOS NA TELA.
 */

import java.util.Arrays;
import java.util.Random;

public class bidi02 {
    public static void main(String[] args) {
        int [][] tables = new int[5][5];



        Random generador = new Random();




        for (int i = 0; i < tables.length; i++) {
            int suma = 0;
            for (int j = 0; j < tables.length ; j++) {
                tables[i][j] = generador.nextInt();
                System.out.print(Arrays.toString(tables) + "\t");
                suma += tables [i] [j];

                

            }System.out.println();


        }


    }
}
