package tarefa_Classes;

import java.util.Scanner;

public class tarefa_Modulo9 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero:");

        int valor = scanner.nextInt();

        System.out.println("O numero foi " + valor);


        Integer numeroFinal = valor;

        System.out.println("O numero após o Wrapper " + valor);


    }
}