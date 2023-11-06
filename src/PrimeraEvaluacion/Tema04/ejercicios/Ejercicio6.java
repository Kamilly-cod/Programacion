package PrimeraEvaluacion.Tema04.ejercicios;
/*
Escribe un programa que lea dos cadenas y las compare sin tener en cuenta los espacios en blanco. El programa debería imprimir true si son iguales, false en caso contrario.
 */
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introce una cadena: ");
        String cadena1, cadena2;
        cadena1 = teclado.nextLine();
        System.out.print("Introce otra cadena: ");
        cadena2= teclado.nextLine();

        //espaciosenblanco =  replace ()
       String result = cadena1.replace(" ","");
       String result2 = cadena2.replace(" ","");
        System.out.println(result);
        System.out.println(result2);

        System.out.println(result.equals(result2));




    }
}
