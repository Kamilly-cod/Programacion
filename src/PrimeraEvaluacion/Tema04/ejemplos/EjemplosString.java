package PrimeraEvaluacion.Tema04.ejemplos;

public class EjemplosString {

    public static void main(String[] args) {

    //Para descubrir caracteres length()-1
     //   System.out.println("Último carácter: " +cadena.charAt(longitud/length()-1));
     // cadena.length (); te devolve algo, como um valor de tipo int
        String cadena1 = "Los ordenadores son buenos siguiendo instrucciones, no leyendo tu mente";
        String cadena2 = "";

        // isEmpty() devuelve true si la cadena está vacía; de lo contrario, false;
        boolean vacia = cadena1.isEmpty();
        boolean llena = cadena2.isEmpty();
        System.out.println("cadena1 está vacía: " + vacia );
        System.out.println("cadena2 está vacía: " +cadena2.isEmpty() );


        //toUpperCase() devuelve una nueva cadena en mayúsculas;
        System.out.println(cadena1.toUpperCase()); // String
        System.out.println(cadena2.toUpperCase()); // String

        //toLowerCase() devuelve una nueva cadena en minúsculas;
        System.out.println(cadena1.toLowerCase()); // String
        System.out.println(cadena2.toLowerCase()); // String

        //startsWith(prefijo) devuelve true si la cadena comienza con el prefijo de cadena dado; de lo contrario, false;


        System.out.println(cadena1.startsWith("Los")); 

        System.out.println(cadena2.startsWith("Oi"));


        //endsWith(sufijo) devuelve true si la cadena termina con el sufijo dado; de lo contrario, false.
        System.out.println(cadena1.endsWith("mente"));
        System.out.println(cadena1.endsWith("Tchau"));

        //contains(...) devuelve true si la cadena contiene la cadena o el carácter dados;
        System.out.println(cadena1.contains("ordenadores"));
        System.out.println(cadena2.contains("chin"));

        //substring(posicionInicial, posicionFinal) devuelve una subcadena de la cadena en el rango: posicionInicial, posicionFinal - 1;
        String subcadena = cadena1.substring(10, 15);
        System.out.println(subcadena);


        //replace(old, new) devuelve una nueva cadena obtenida reemplazando todas las apariciones de old con new que pueden ser caracteres o cadenas.
        System.out.println(cadena1.replace("buenos","bons"));
        System.out.println(cadena2.replace("","Kamilly Brito"));

        //trim() devuelve una copia de la cadena obtenida al omitir los espacios en blanco iniciales y finales. Ten en cuenta que el espacio en blanco incluye no solo el carácter de espacio, sino principalmente todo lo que parece vacío: tabulación, retorno de carro, carácter de nueva línea, etc.
        String conBlancos = "    Linda      ";
        System.out.println(conBlancos);
        System.out.println(conBlancos.trim());
        System.out.println(conBlancos.length());
    }
}
