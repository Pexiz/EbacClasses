package tarefa_Classes;

import java.util.Scanner;

public class tarefa_Exercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double somatorio = 0;

        System.out.println("Digite as quatro notas:");
        for (int i = 0; i < 4 ; i++) {
            double nota = scanner.nextDouble();
            somatorio += nota;

        }
        somatorio =somatorio/4;

if (somatorio >= 7)
{
    System.out.println("Aluno APROVADO com a media de :" + somatorio);

} else if (somatorio >=5) {
    System.out.println("Aluno em RECUPERAÇÃO com a media de :" + somatorio);

}
else    System.out.println("Aluno REPROVADO com a media de :" + somatorio);

    }
}

