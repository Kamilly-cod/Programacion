package Random;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        Random generador = new Random();
        int numeroAleatorio = generador.nextInt(10);
        for ( int i = 0; i < 100; i++) {
            System.out.print(numeroAleatorio + " ");
           // numeroAleatorio = generador.nextInt(10);
            numeroAleatorio = generador.nextInt(1,11);
            // En general si quieres generar un número entre min y max,
            // haces generador.nextInt(min, max + 1)
        }
        for (int i=0; i < 50; i++) {
            System.out.print(generador.nextInt(-10,11) + "");

        }

    }
}
