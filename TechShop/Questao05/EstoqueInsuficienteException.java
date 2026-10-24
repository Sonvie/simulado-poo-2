package TechShop.Questao05;

public class EstoqueInsuficienteException extends Exception{
    public EstoqueInsuficienteException(String nomeProduto, int quantidadeProduto){
        super("Estoque insuficiente para " + nomeProduto + ". Disponível: " + quantidadeProduto);
    }
}
