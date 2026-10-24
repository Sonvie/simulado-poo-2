package TechShop.Questão04;

import TechShop.Questão02.Produto;
import TechShop.Questão02.ProdutoFisico;
import TechShop.Questão05.EstoqueInsuficienteException;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Produto> itens = new ArrayList<>();

    public void adicionar(Produto p){
        itens.add(p);
    }

    public void adicionar(Produto p, int quantidade) throws EstoqueInsuficienteException{
        if (quantidade > p.getEstoque()){
            throw new EstoqueInsuficienteException(p.getNome(), p.getEstoque());
        }
        
        for (int i = 0; i < quantidade; i++){
            itens.add(p);
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (Produto item:itens){
            total += item.calcularPrecoFinal();
        }
        return total;
    }

    public double calcularFreteTotal(String cep){
        double total = 0;
        for (Produto item:itens){
            if (item instanceof ProdutoFisico pf){
                total += pf.prazoEntregaDias(cep);
            }
        }
        return total;
    }
}
