package TechShop.Questão01;

public class Pessoa{
    private String nome;
    private String cpf;
    private String email;

    public Pessoa(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String toString(){
        return "Nome: " + nome + " | CPF: " + cpf;
    }
}