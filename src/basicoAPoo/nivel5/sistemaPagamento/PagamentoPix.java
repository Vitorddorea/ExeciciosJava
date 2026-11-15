package basicoAPoo.nivel5.sistemaPagamento;

public class PagamentoPix extends Pagamento{
    private String chavePix;

    public PagamentoPix(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento() {
        super.processarPagamento();
        System.out.println("R$" + getValor());
        System.out.println("Pagamento via Pix " + chavePix);
    }
}
