package TechShop.Questão01;

public class ClienteVip extends Cliente{
    private double percentualDesconto = 0.10;

    public ClienteVip(String nome, String cpf, String email, String endereco, double percentualDesconto){
        super(nome, cpf, email, endereco);
        this.percentualDesconto = percentualDesconto;
    }
    @Override
    public String toString(){
        return super.toString() + " | VIP (10%)";
    }

    public double getPercentualDesconto(){
        return percentualDesconto;
    }
}
