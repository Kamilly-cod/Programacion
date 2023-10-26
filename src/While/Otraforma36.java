package While;

public class Otraforma36 {
    public static void main(String[] args) {
        // ideia: ir encrementando i, imprimindo somente os multiplos de 5;
        // Utilizamos uma variavel contador, para que se incremente cada vez que encontramos um multiplo
        int i = 0;
        int contador = 0;
        while (contador < 20) {
            if (i% 5 ==0 && i != 0) {
                System.out.println(i);
                contador++;
            }
            i++;
        }
    }
}

