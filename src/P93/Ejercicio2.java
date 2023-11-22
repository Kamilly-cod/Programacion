package P93;
/*
La entrada estará compuesta de distintos indicadores económicos, cada uno de ellos en dos líneas distintas. La primera línea indica el número de muestras recogidas del indicador (0 < n ≤ 100). La segunda línea contiene n números positivos con los valores económicos (entre 1 y 10.000.000) medidos desde el día de la declaración de la abeja reina hasta el día de hoy.

La entrada termina con un indicador sin muestras (0) que no debe procesarse.


 */
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();teclado.nextLine();

        while (n !=0) {
            String linea = teclado.nextLine();
            String[] elementos = linea.split(" ");


            int[] num = new int[elementos.length];
            for (int i = 0; i < num.length; i++) {
                num[i] = Integer.parseInt(elementos[i]);

            }

            boolean Salecrisis = true;
            for (int i = 0; i < num.length - 1; i++) {
                if (num[i] >= num[i+1] ){

                        Salecrisis = false;
                        break;

                }
            }
            if (Salecrisis) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }



            n = teclado.nextInt();
            teclado.nextLine();




            }


        }





    }

