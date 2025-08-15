package edu.leandro.EstruturasCondicionais;
// resultado escolar
public class CondicoesTernaria {
    public static void main(String[] args) {
        int nota = 6;
        String resultado = nota >= 7 ? "aprovado" : nota >= 5 && nota < 7 ? "recuperaçao" : "reprovado";

        System.out.println(resultado);
    }

}
