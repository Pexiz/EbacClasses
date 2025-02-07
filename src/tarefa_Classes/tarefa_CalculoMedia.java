package tarefa_Classes;

import java.util.Scanner;

public  class tarefa_CalculoMedia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as quatro notas:");

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double nota4 = scanner.nextDouble();

        double soma = nota1 + nota2 + nota3 + nota4;
        double media = soma / 4;

        System.out.println("A media das notas é: " + media);


    }
}