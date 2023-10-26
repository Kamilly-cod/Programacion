package buclesAnidados;

public class Ejemplo01 {
    public static void main(String[] args) {
        // com for fazemos como se fosse uma linha, e se metemos um salto de línea seria uma linha vestical.
        // para hacer formas geométricas
    //i; sao as colunmas
    // j; sao as filaa
        for ( int i = 0; i < 5 ; i++) {
            for (int j = 0;j <= 5 ; j++) {
                System.out.print("f" + i + "c" + j + " ");
            }
            System.out.println(); // esse é um salto de línea cada vez que faz um bucle
        }
        System.out.println("\n\n");

        for (int k = 1; k <= 10; k++ ) {

            for (int l = 1; l <= 10; l++) {

                System.out.print((k * l)+"\t"); // o t seria como se fosse padding
            }
            System.out.println();
        }
    }
}
