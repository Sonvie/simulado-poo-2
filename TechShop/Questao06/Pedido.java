package TechShop.Questao06;

import TechShop.Questao01.*;
import TechShop.Questao03.*;
import TechShop.Questao04.*;
import TechShop.Questao05.*;

public class Pedido {
    Cliente cliente;
    CarrinhoDeCompras carrinhoCompras;

    public Pedido(Cliente cliente, CarrinhoDeCompras carrinhoCompras){
        this.cliente = cliente;
        this.carrinhoCompras = carrinhoCompras;
    }

    public void Finalizar(Pagamento pagamento){
        double subtotal = carrinhoCompras.calcularTotal() + carrinhoCompras.calcularFreteTotal(cliente.getEndereco());
        if (cliente instanceof ClienteVip cVip){
            subtotal += cVip.getPercentualDesconto();
        }
        try{
            double valorFinal = pagamento.calcularValorFinal(subtotal);
            pagamento.exibirComprovante(subtotal);
            cliente.adicionarPontos((int)(valorFinal % 10));
        } catch (PagamentoRecusadoException e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Pedido encerrado.");
        }
    }
}
