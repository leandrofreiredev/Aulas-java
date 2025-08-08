package edu.leandro.operadores;

public class OperadorTernario {
    public static void main(String[] args) {
        int a, b ;

        a = 5;
        b = 5;
        // EXPRESSAO logica se "a" for igual à "b" verdadeiro (:)caso contrario é falso.
        String resultado = a == b ?"Verdadeiro" : "falso";

        System.out.println(resultado);
    }
}
