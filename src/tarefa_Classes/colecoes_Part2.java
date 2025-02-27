package tarefa_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.sort;

public class colecoes_Part2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Boolean sair = false;
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();


        while (!sair) {
            System.out.println("Digite nome de pessoas com a - separando nome e genero PEDRO-m-Mariana-f ");
            String valor = scanner.nextLine();
            String[] nomes = valor.split("-");

            for (int i = 0; i < nomes.length; i++) {
                if (nomes[i].equals("m") && i > 0) {
                    masculino.add(nomes[i - 1]);
                }
            }

            for (int i = 0; i < nomes.length; i++) {
                if (nomes[i].equals("f") && i > 0) {
                    feminino.add(nomes[i - 1]);
                }
            }
            System.out.println("Se desejar sair digite SIM");
            String verificacao = scanner.nextLine();
            if (verificacao.equals("sim")) {
                sair = true;
            }

            sort(masculino);
            sort(feminino);

            System.out.println("Os nomes MASCULINOS SÃO: ");
            for (String nome : masculino) {
                System.out.println(nome);
            }

            System.out.println("Os nomes FEMININOS SÃO: ");
            for (String nome : feminino) {
                System.out.println(nome);
            }
        }
    }

}
