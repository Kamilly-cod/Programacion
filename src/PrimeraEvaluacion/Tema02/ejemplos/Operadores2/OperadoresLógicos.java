package PrimeraEvaluacion.Tema02.ejemplos.Operadores2;
/*
https://drive.google.com/file/d/1s_CGmUs3c-rO7o681OArhINztA_VZnze/view
 */




public class OperadoresLógicos {
    public static void main(String[] args) {
        // El operador not (!) faz com que tuda a variavel seja ao contrario é como se fosse o sinal de negacion em filosofia ¬
        boolean variable = true;
        System.out.println(variable);
        variable = !variable;
        System.out.println(variable);

        // Los operadores binarios and, or y not.
        boolean v1 = true;
        boolean v2 = true;

        boolean resultadoAnd = v1 && v2; // true
        boolean resultadoOr = v1 || v2;
        System.out.println("\ntrue\ttrue"); // \t mete uma tabela no String ou cadena de caracteres
        System.out.println(resultadoAnd);
        System.out.println(resultadoOr);


        System.out.println("\ntrue\tfalse");
        v2 = false;
        resultadoAnd = v1 && v2;
        resultadoOr = v1 || v2;
        System.out.println(resultadoAnd); // false
        System.out.println(resultadoOr);


        v1 = false;
        v2 = true;
        System.out.println("\nfalse\ttrue");
        resultadoAnd = v1 && v2;
        resultadoOr = v1 || v2;
        System.out.println(resultadoAnd); // false
        System.out.println(resultadoOr);


        v1 = false;
        v2 = false;
        resultadoAnd = v1 && v2;
        resultadoOr = v1 || v2;
        System.out.println("\nfalse\tfalse");
        System.out.println(resultadoAnd); // false
        System.out.println(resultadoOr);


    }
}
