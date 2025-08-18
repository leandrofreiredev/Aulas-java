package edu.leandro.EstruturasRepeticao;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada  > 0){
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("Doce de valor: " +valorDoce + "adicinaodo ao carrinho");
            mesada = mesada -valorDoce;

            System.out.println("Mesada: " + mesada);
            System.out.println("Joao gastou toda sua mesada com doces.");
        }

    }

    private static Double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
