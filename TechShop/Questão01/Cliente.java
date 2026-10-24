package TechShop.Questão01;

public class Cliente extends Pessoa{
    private String endereco;
    private int pontosFidelidade = 0;

    public Cliente(String nome, String cpf, String email, String endereco){
        super(nome, cpf, email);
        this.endereco = endereco;
    }

    public void adicionarPontos(int pontos){
        pontosFidelidade = pontos;
    }
}
