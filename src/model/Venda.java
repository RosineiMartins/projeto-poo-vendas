package model;

import java.util.ArrayList;

public class Venda {
    private float valorTotal;

    private ArrayList<Produto> listaVenda;


    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
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
        listaVenda.add(prod);
        valorTotal += prod.getPreco();

    }

    public void visualizarVenda() {
        for (Produto prod : listaVenda) {
            System.out.println("Produto " + prod.getNome() + " Preco " + prod.getPreco());

        }

    }

    public void concluirVenda(Pagamento pagamento) {

        System.out.println("Valor Total de venda: " + valorTotal);
        pagamento.realizarPagamento(pagamento);
        listaVenda = new ArrayList<>();

    }

}
