package Arrays04;

import java.util.Arrays;
import java.util.Random;

public class bidimensonales01 {
    public static void main(String[] args) {
        // ARRAYS BIDIMENSIONALES
        // ARRAY formado por cierto número de array que no necesita tener el mismo tamaño.

        // trés arrays bidimensionales, cada una con 4 elementos, mas nao precisam ser todos do mesmo tamanho.
        int [] [] tabla = {
                {1,2,3,1}, // fila : Variavel [i]
                {3,4,1,2}, // columna, elemento do índice do array [i].
                {4,4,1,0} // tercer array de numeros inteiros
        };
        System.out.println(Arrays.toString(tabla[0]));
        System.out.println(Arrays.toString(tabla[1]));
        System.out.println(Arrays.toString(tabla[2]));

        System.out.print(tabla[1][0]); // para sacar un solo emlemento.
        System.out.print(tabla[1][1]); // para sacar un solo emlemento.
        System.out.print(tabla[1][2]); // para sacar un solo emlemento.
        System.out.print(tabla[1][3]); // para sacar un solo emlemento.
        //System.out.print(tabla[i][j]);

        // i= fila j = columna

        System.out.println(" ");
        System.out.println(tabla[tabla.length-1][0]);
        System.out.println(tabla[0][tabla[0].length-1]);

        System.out.println(tabla[tabla.length-1] [tabla[tabla.length-1].length-1]);

        char [][] caracteres = new char[6] [4];

        Random generador = new Random();
        // a i do for vai ser a fila

        for (int i = 0; i < caracteres.length; i++) {

            for (int j = 0; j < caracteres[i].length ; j++) {
                caracteres[i][j] = (char) generador.nextInt( 64,95);
                //caracteres[i][j] = (char) COLOCO ISSO PARA CONVERTER O INT EM UM CHAR, ENTAO FAZ COM QUE EU POSSA UTILIZAR JA QUE A VARIAVEL É UM CHAR:
                // É PARA CONVERTEEEERRR
                // generador.nextInt( 64,95);



            }

        }
        for (int i = 0; i < caracteres.length; i++) {
            for (int j = 0; j < caracteres[i].length; j++) {
// DA FILA QUE VC ESTA CONSIDERANDO ME COJA O MAXIMO DO SEU LÍMITE.
                System.out.print(caracteres[i][j] + " \t");
            }
            System.out.println();

        }

        //
        System.out.println(caracteres[3][2]);









    }
}
