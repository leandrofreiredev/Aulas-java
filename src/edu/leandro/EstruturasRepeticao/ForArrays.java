package edu.leandro.EstruturasRepeticao;

public class ForArrays {
    public static void main(String[] args) {
        // EM ARRAY O INDICE COMEÇA EM 0.
        String pessoa[] = {"LEO", "CAIO", "LEVI","SUZY"};
        for (int x = 0; x < pessoa.length; x++) {
            System.out.println("A pessoa no indice x = " + x + " é " + pessoa [ x ]);
        }
    }
}
