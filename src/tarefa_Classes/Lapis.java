package tarefa_Classes;

public class Lapis {

    private int quantidade;
    private String cor;
    private boolean contemBorracha;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void changeContemBorrachaToTrue(boolean contemBorracha)
    {
        if (contemBorracha) {
            this.contemBorracha = true;
        }
//        A ideia seria apenas validar se contem algo mesmo antes de alterar seu valor
//        Aqui foi so pra dar o exemplo do comentario CTRL + /
    }

}
