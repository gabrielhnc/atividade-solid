package delivery.repository;

import delivery.model.Pedido;

public class PedidoRepository {

    public void salvar(Pedido pedido) {
        System.out.println("Pedido #" + pedido.getId() + " salvo com sucesso!");
    }
}
