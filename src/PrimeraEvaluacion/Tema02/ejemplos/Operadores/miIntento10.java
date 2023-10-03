package PrimeraEvaluacion.Tema02.ejemplos.Operadores;
/*
Escribe un programa que, dado un importe en euros, indique el número mínimo de billetes y monedas que se puede utilizar para obtener dicha cantidad. Por ejemplo:
 */


import java.util.Scanner;

public class miIntento10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int euros = teclado.nextInt();
        //***************************
        int b500 = euros / 500;
        System.out.println(b500 + " billetes de 500");
        int resto = euros % 500;
        //**************************
        int b200 = resto / 200;
        System.out.println(b200 + " billetes de 200");
        resto = resto % 200; // int b100 = b200 / 200;
        //***************************
        int b100 = resto / 100;
        System.out.println(b100 + " billetes de 100");
        resto = resto % 100;
        //****************************
        int b50 = resto / 50;
        System.out.println(b50 + " billetes de 50");
        resto = resto % 50;
        //******************************
        int b20 = resto / 20;
        System.out.println(b20 + " billetes de 20");
        resto = resto % 20;
        //*************************
        int b10 = resto / 10;
        System.out.println(b10 + " billetes de 10");
        resto = resto % 10;
        //************************
        int b5 = resto / 5;
        System.out.println(b5 + " billetes de 5");
        resto = resto % 5;
        //**************************
        int b2 = resto / 2;
        System.out.println(b2 + " monedas de 2");
        resto = resto % 2;
        //*********************
        int b1 = resto / 1;
        System.out.println(b1 + " monedas de 1");

     //   System.out.println(resto);
      //  System.out.println(b100 + " billetes de 100 ");
     //   resto = resto % 100;
        //********************************
     //   System.out.println(resto);
      //  int b50 = resto / 50;
        //********************************
     //   System.out.println(resto);
     //   int b20 = resto / 20;
        //******************************
    //    System.out.println(resto);
     //   int b10 = resto / 10;
        //****************************
     //   System.out.println(resto);
     //   int b5 = resto / 5;
        //*********************************
     //   System.out.println(b5 + " billetes de 5");
     //   int m2 = resto / 2;


 // = assignación, pego o que tenho primeiro da direita a esquerda.



    }
}
