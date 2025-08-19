package ProjetoProcessoSeletivo;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"FELIPE", "LEANDRO", "SUZY", "LEVI", "CAIO"};

        // Loop para tentar contato com cada candidato
        for (String candidato : candidatos) {
            entrandoEmContato(candidato); // chamando METODO
        }
    }

    // SIMULA SE O CANDIDATO ATENDEU
    static boolean atender() {
        return new Random().nextInt(3) == 1;
        // retorna TRUE 1/3 das vezes
    }

    //  tentar entrar em contato com um candidato
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;

        // tenta até 3 vezes
        do {
            atendeu = atender();              // simula ligação
            continuaTentando = !atendeu;      // se não atendeu, continua
            if (continuaTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
        } while (continuaTentando && tentativasRealizadas < 3);

        // Resultado final
        if (atendeu)
            System.out.println("CONSEGUIMOS O CONTATO COM " + candidato +
                    " NA " + tentativasRealizadas + "ª TENTATIVA.");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +
                    " NO LIMITE DE " + tentativasRealizadas + " TENTATIVAS.");
    }

    //  imprimir a lista de candidatos
    static void imprimirSelecionados() {
        String[] candidatos = {"FELIPE", "LEANDRO", "SUZY", "LEVI", "CAIO"};
        System.out.println("IMPRIMINDO LISTA DE CANDIDATOS INFORMANDO O ÍNDICE");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº " + (indice + 1) + " é " + candidatos[indice]);
        }

        System.out.println("FORMA ABREVIADA DE ITERAÇÃO (for-each):");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    // selecionar até 5 candidatos com base no salário pretendido
    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "LEANDRO", "SUZY", "LEVI", "CAIO", "KELLY", "MONICA", "CARLOS", "PAULO"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        // Continua até selecionar 5 ou acabar a lista
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou salário de R$ " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("→ " + candidato + " FOI SELECIONADO.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    // gera um valor aleatório de salário pretendido entre 1800 e 2200
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // analisar se o salário pedido bate com a base
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDAR RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
