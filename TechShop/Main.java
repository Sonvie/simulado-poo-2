package TechShop;

import TechShop.Questao01.*;
import TechShop.Questao02.*;
import TechShop.Questao03.*;
import TechShop.Questao04.*;
import TechShop.Questao05.*;
import TechShop.Questao06.*;

public class Main{
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