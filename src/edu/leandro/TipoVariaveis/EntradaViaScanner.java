package edu.leandro.TipoVariaveis;

import java.util.Scanner;
import java.util.Locale;

public class EntradaViaScanner {
    public static void main(String[] args) {
        // criando scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite seu idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite seu altura: ");
        double altura = scanner.nextDouble();

        // imprimindo os dados do usuário.
        System.out.println("Olá,me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " cm ");
    }
}
