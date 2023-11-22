package Arrays04;

import java.util.Arrays;
import java.util.Random;

public class Foreach {
    public static void main(String[] args) {
        // È uma maneira de pegar o valor dos arrays alternativa do for normal.

        int [] nombreArray = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        for (int valor: nombreArray) {
            System.out.println(valor * 2);

        }

    }
}
