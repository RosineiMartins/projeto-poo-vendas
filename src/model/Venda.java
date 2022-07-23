package model;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;

public class Venda {
    DecimalFormat decFormat = new DecimalFormat("'R$ ' 0.##");
    private BigDecimal valorTotal;

    private ArrayList<Produto> listaVenda;


    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ArrayList<Produto> getListaVenda() {
        return listaVenda;
    }

    public void setListaVenda(ArrayList<Produto> listaVenda) {
        this.listaVenda = listaVenda;
    }

    public void adicionarItemVenda(Produto prod) {
        if (listaVenda == null) {
            listaVenda = new ArrayList<>();
        }
        if (Objects.isNull(valorTotal)) {
            valorTotal = BigDecimal.ZERO;
        }
        listaVenda.add(prod);
        valorTotal = valorTotal.add(prod.getPreco());

    }

    public void visualizarVenda() {

        for (Produto prod : listaVenda) {
            System.out.println("Produto " + prod.getNome() + " Preco " + decFormat.format(prod.getPreco()));

        }

    }

    public void concluirVenda(Pagamento pagamento) {

        System.out.println(String.format(String.format("Valor Total de venda: " + decFormat.format(valorTotal))));
        pagamento.realizarPagamento(pagamento);
        listaVenda = new ArrayList<>();

    }

}
