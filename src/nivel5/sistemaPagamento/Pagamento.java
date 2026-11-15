package nivel5.sistemaPagamento;

public class Pagamento {
    private double valor;

    public Pagamento(double valor) {
       setValor(valor);
    }

    public void processarPagamento(){
        System.out.println("Processando pagamento...");
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido!");
        }
        this.valor = valor;
    }
}
