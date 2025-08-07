package edu.leandro.anatomiaClasses;

public class Metodos {

    // tipo de retorno Nome d objetivo pararamentro()

    public static void main(String[] args) {

        String primeiroNome = "Leandro";
        String segundoNome = "Freire";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);




    }

    public static  String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do Método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
