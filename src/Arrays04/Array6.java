package Arrays04;

import java.util.Arrays;
import java.util.Random;

/*
Realizar un programa en el se se inicialice un array de longitud 20 con números aleatorios comprendidos entre -10 y 10. A continuación, mostrar la media de los números positivos,la media de los negativos y contar el número de ceros.
 */
public class Array6 {
    public static void main(String[] args) {
        int[] longitud = new int[20];
        Random generador = new Random();
    int contador = 0;
    int contadorP = 0;
    int contadorN = 0;
    double sumaP = 0;
    double sumaN = 0;
        for (int i = 0; i < longitud.length; i++) {
            longitud[i] = generador.nextInt(-10,11);
            if (longitud[i]<0) {
                sumaP += longitud[i];
                contadorP++;

            }
            else if (longitud[i]>0) {
                sumaN -= longitud[i];
                contadorN++;

            }else {
                contador++;
            }
        }
        System.out.println(Arrays.toString(longitud));

    }
}
