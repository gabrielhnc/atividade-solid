package delivery.service.pagamento;

public class PagamentoDinheiro implements IFormaPagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + String.format("%.2f", valor) + " em dinheiro registrado.");
    }
}
