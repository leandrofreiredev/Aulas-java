package edu.leandro.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean concicao1 = true;
        boolean condicao2 = true;

        if(concicao1 && condicao2){
            System.out.println("Se as duas condições são verdadeiras");

        }
        if (concicao1 || condicao2 ){
            System.out.println("Se uma das duas condições é verdadeira");
        }
        System.out.println("fim");
    }
}
