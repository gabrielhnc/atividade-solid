package delivery.service.pagamento;

public class PagamentoCartao implements IFormaPagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + String.format("%.2f", valor) + " via Cartão de Crédito/Débito.");
    }
}
