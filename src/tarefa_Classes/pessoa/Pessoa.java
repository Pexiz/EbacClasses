package tarefa_Classes.pessoa;

public abstract class Pessoa {

        int idade;

        String nome;

        abstract int getCpfOrCnpj();

        abstract String endereco();

       abstract void trabalho();

}
