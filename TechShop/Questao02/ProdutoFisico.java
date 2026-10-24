package TechShop.Questão02;

import TechShop.Questão03.Entregavel;

public class ProdutoFisico extends Produto implements Entregavel{
    private double pesoKg;

    public ProdutoFisico(String codigo, String nome, double precoBase, int estoque, double pesoKg){
        super(codigo, nome, precoBase, estoque);
        this.pesoKg = pesoKg;
    }

    @Override
    public double calcularPrecoFinal(){
        return getPrecoBase() + (getPrecoBase() * 0.10);
    }

    @Override
    public double calcularFrete(){
        return 15.00 + (2.00 * pesoKg);
    }

    @Override 
    public int prazoEntregaDias(String cep){
        if (cep.startsWith("6")){
            return 7;
        }
        return 12;
    }
}
