package tarefa_Classes.pessoa;

public class Juridica extends Pessoa {

    int cnpj;

    String enderecoJuridico;

    String trabalho;

    @Override
    int getCpfOrCnpj() {
        return cnpj;
    }

    @Override
    String endereco() {
        return enderecoJuridico;
    }


    @Override
    void trabalho() {
        System.out.println("CNPJ/Freela...");

    }

    // nao sei muito de diferenças kkk
}
