package edu.leandro.operadores;

public class OperadoresRelacionais {

    public static void main(String[] args) {

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numero Um é igual ao numero dois ?" + simNao);

        simNao = numero1 != numero2;
        System.out.println("numero Um é diferente ao numero dois ?" + simNao);

        simNao = numero1 > numero2;
        System.out.println("numero Um é maior ao numero dois ?" + simNao);

        simNao = numero1 < numero2;
        System.out.println("numero Um é menor ao numero dois ?" + simNao);




    }
}
