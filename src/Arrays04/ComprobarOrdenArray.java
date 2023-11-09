package Arrays04;

import java.util.Arrays;

public class ComprobarOrdenArray {
    public static void main(String[] args) {
        int []  array1 = new int [5];
        for (int i = 0; i < array1.length; i++) {
            if (i % 2 == 0) {
                array1[i] = i + 2;

            } else {
                array1[i] = i - 2 * i;
            }
            System.out.println(Arrays.toString(array1));

            int[] array2 = {-5,10,16,18,100};



        }


    }
}
