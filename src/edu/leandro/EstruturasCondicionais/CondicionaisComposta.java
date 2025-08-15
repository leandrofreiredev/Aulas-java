package edu.leandro.EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class CondicionaisComposta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       //int nota = 6;
        System.out.println("Digite sua Nota: ");
        int nota = scanner.nextInt();

        if (nota >= 7)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");


    }
}
