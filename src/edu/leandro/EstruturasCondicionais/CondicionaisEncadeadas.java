package edu.leandro.EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class CondicionaisEncadeadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //int nota = 6;
        System.out.println("Digite sua Nota: ");
        int nota = scanner.nextInt();

         if (nota >= 7)
             System.out.println("Aprovado");

           else if (nota >= 5 && nota < 7) // true ou false
               System.out.println("Prova de Recuperação");
            
          else
            System.out.println("Aprovado");
        }



    }