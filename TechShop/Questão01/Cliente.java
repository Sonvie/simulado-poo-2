package TechShop.Questão01;

public class Cliente extends Pessoa{
    private String endereco;
    private int pontosFidelidade = 0;

    public Cliente(String nome, String cpf, String email, String endereco){
        super(nome, cpf, email);
        this.endereco = endereco;
    }

    public void adicionarPontos(int pontos){
        pontosFidelidade += pontos;
    }

    //estou na dúvida se esse endereço é o CEP do cliente, mas é o que bate.
    public String getEndereco(){
        return endereco;
    }
}
