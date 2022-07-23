package model;

import java.math.BigDecimal;

public class Produto {


    private String nome;
    private BigDecimal preco;
    private int quantidadeEstoque;

    public Produto(String nome, BigDecimal preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean verificarEstoque(Produto prod) {
        return prod.getQuantidadeEstoque() > 0;


    }

}
