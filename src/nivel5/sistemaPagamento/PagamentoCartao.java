package nivel5.sistemaPagamento;

public class PagamentoCartao extends Pagamento{
    private String numeroCartao;

    public PagamentoCartao(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        super.processarPagamento();
        System.out.println("R$" + getValor());
        System.out.println("Pagamento com cartão " + numeroCartao);
    }
}
