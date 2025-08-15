package Projetos.ContaBanco;

import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 1.500;

        System.out.println("Digite seu Nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite susa Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o numero da sua conta: ");
        int conta = scanner.nextInt();

        // imprimindo os dados .

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo é R$: %.3f, que se encontra disponível para saque.\n",
                nome, agencia, conta, saldo);

    }

}
