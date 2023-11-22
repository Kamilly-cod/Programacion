package Arrays04;

import java.util.Arrays;

public class EjemploSplit {
    public static void main(String[] args) {
        String cadena = " 1 2 3 4 5 6  7  8 9 10";
        String[] array = cadena.split( " "); // split é usado para o que esta separando ele, por exemplo se for um espaço, vai ser " ", se for uma virgula, vai ser ",". inteiro.paraInt
        System.out.println(Arrays.toString(array));

        int [] numeros = new int[array.length]; // Interger.parseInt (cadena), isso é utilizado para transformar um String em um int, em um número.


        String uno = "1";
        String dos = "2";

        int n1 = Integer.parseInt(uno);
        int n2 = Integer.parseInt(dos);
        System.out.println(n1+n2);

        for (int i = 0; i < numeros.length ; i++) {
            numeros[i] = Integer.parseInt(array[i]);
        }
        System.out.println(Arrays.toString(numeros));


        }

    }



