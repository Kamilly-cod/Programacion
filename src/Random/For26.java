package Random;

/*
Hacer un programa que calcule la suma y el producto de los 30 primeros números naturales. (El 0 no cuenta)
 */

public class For26 {
    public static void main(String[] args) {
        // la suma seria: 1 + 2 + 3 + ... + 30 ( ambos incluidos )
        int suma = 0;
        for (int i =1; i <=30; i++) {
            suma = suma + i;
        }
        System.out.println("Suma = " +suma);

        int producto = 1; // El producto tenemos que poner 1 porque a 0 daria error
        for (int i = 1; i < 31; i++) {
            producto = producto * i;
        }
        System.out.println("Producto= " +producto);
    }
}
