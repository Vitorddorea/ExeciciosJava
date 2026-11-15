package nivel5.sistemaPagamento;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamentoC = new PagamentoCartao(2, "123");
        Pagamento pagamentoP = new PagamentoPix(34, "1233");

        ArrayList<Pagamento> pagamentos = new ArrayList<>();
        pagamentos.add(pagamentoC);
        pagamentos.add(pagamentoP);

        for (Pagamento pagamento : pagamentos){
            pagamento.processarPagamento();
        }
    }
}
