package model;

public class Pagamento {

    private int tipoPagamento;

    public int getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(int tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public void selecionarTipoPagamento(int tipoPagamento) {
        setTipoPagamento(tipoPagamento);


    }

    public void realizarPagamento(Pagamento pagamento) {

        String tipoPag = switch (pagamento.getTipoPagamento()) {
            case 1 -> "Dinheiro";
            case 2 -> "Cheque";
            case 3 -> "Cartao";
            default -> "";
        };
        System.out.println("Pagamento realizado com sucesso " + tipoPag);

    }


}



