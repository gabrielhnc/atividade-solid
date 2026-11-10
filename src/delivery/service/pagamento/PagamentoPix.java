package delivery.service.pagamento;

public class PagamentoPix implements IFormaPagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Chave Pix gerada para o pagamento no valor de R$ " + String.format("%.2f", valor) + ".");
    }
}
