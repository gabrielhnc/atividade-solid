package delivery.view;

import delivery.model.Pedido;
import delivery.model.Produto;

public class PedidoView {

    public void exibir(Pedido pedido) {
        System.out.println("===== DETALHES DO PEDIDO #" + pedido.getId() + " =====");
        System.out.println("Itens:");
        for (Produto produto : pedido.getProdutos()) {
            System.out.println(" - " + produto.getDetalhes());
        }
        System.out.println("Valor Total: R$ " + String.format("%.2f", pedido.getValorTotal()));
        System.out.println("====================================");
    }
}
