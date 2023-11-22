package PrimeraEvaluacion.Tema02.ejercicios.OperadoresEJ;
/*
Un vendedor recibe un sueldo base mas un 10% de comisión por comisión sobre el total de las ventas que realice. El vendedor realiza tres ventas este mes y quiere saber cuánto dinero obtendrá por concepto de comisiones y el total que cobrará. Todos los datos que se desconocen se piden por teclado.
 */
import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Sueldo base: ");
        double sueldo = teclado.nextDouble();
        System.out.println("Importe de la venta 1: ");
        double venta1 = teclado.nextDouble();
        System.out.println("Importe de la venta 2: ");
        double venta2 = teclado.nextDouble();

    }
}
