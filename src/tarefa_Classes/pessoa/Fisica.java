package tarefa_Classes.pessoa;

public class Fisica extends Pessoa {

    int CPF;

    String enderecoFisica;

    @Override
    int getCpfOrCnpj() {
        return CPF;
    }

    @Override
    String endereco() {
        return enderecoFisica;
    }

    @Override
    void trabalho() {
        System.out.println("Sou CLT");

    }


}
