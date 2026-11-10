package delivery.service.gestao;

public class ServicoPedido implements IGerenciadorPedido {

    @Override
    public void criarPedido() {
        System.out.println("Novo pedido iniciado no sistema!");
    }

    @Override
    public void cancelarPedido() {
        System.out.println("Pedido foi cancelado com sucesso.");
    }
}
