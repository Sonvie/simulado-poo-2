package TechShop.Questão03;

import TechShop.Questão05.PagamentoRecusadoException;

public class PagamentoCartao implements Pagamento{
    private int parcelas;
    private double limite;

    public PagamentoCartao(int parcelas, double limite){
        this.parcelas = parcelas;
        this.limite = limite;
    } 


    @Override 
    public double calcularValorFinal(double valor) throws PagamentoRecusadoException{
        if (parcelas > 3){
            return valor + (valor * 0.08);
        }
        if (valor > limite){
            throw new PagamentoRecusadoException("Pagamenteo recusado. O valor excedeu o límite.");
        }
        return valor;
    }

    @Override 
    public String getDescricao(){
        return "Cartão";
    }
}
