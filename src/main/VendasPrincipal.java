package main;

import model.Pagamento;
import model.Produto;
import model.Venda;

public class VendasPrincipal {
    private static void validarAdicionar(Produto prod, Venda venda) {
        if (prod.verificarEstoque(prod)) {
            venda.adicionarItemVenda(prod);
        } else {
            System.out.println(" Produtos sem estoque: " + prod.getNome());


        }

    }

    public static void main(String[] args) {

        Produto produto1 = new Produto("Laranja", 2.00, 25);
        Produto produto2 = new Produto("Maca", 1.50, 1);
        Produto produto3 = new Produto("abacate", 10.00, 20);
        Produto produto4 = new Produto("tomate", 7.50, 0);

        Venda venda1 = new Venda();

        validarAdicionar(produto1, venda1);
        validarAdicionar(produto2, venda1);
        validarAdicionar(produto3, venda1);
        validarAdicionar(produto4, venda1);


        venda1.visualizarVenda();
        Pagamento pagamento1 = new Pagamento();
        pagamento1.selecionarTipoPagamento(3);

        venda1.concluirVenda(pagamento1);

        Venda venda2 = new Venda();

        System.out.println("_____________________________");
        validarAdicionar(produto1, venda2);
        validarAdicionar(produto2, venda2);
        validarAdicionar(produto3, venda2);
        validarAdicionar(produto4, venda2);

        System.out.println("");
        venda2.visualizarVenda();
        Pagamento pagamento2 = new Pagamento();
        pagamento2.selecionarTipoPagamento(2);
        System.out.println("_____________________________");
        venda2.concluirVenda(pagamento2);


    }
}
