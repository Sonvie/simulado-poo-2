package TechShop.Questão06;

import TechShop.Questão01.*;
import TechShop.Questão02.*;
import TechShop.Questão03.*;
import TechShop.Questão04.*;
import TechShop.Questão05.*;

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

class Main{
    public static void main(String[] args) {
        Cliente cvip = new ClienteVip("Jeferson", "111", "jeferson@mail.com", "62230-000", 0.10);
        CarrinhoDeCompras compras = new CarrinhoDeCompras();
        Produto p1 = new ProdutoDigital("111", "Mineirinho", 20.00, 50, 600);
        Produto p2 = new ProdutoFisico("222", "Mídia Física Mineirinho", 49.99, 10, 0.2);
        compras.adicionar(p1);
        compras.adicionar(p2);

        Pagamento pagamentoPix = new PagamentoPix();
        Pagamento pagamentoCartao = new PagamentoCartao(6, 12.00);
        Pedido pedido1 = new Pedido(cvip, compras);

        pedido1.Finalizar(pagamentoPix);

        pedido1.Finalizar(pagamentoCartao);

    }
}