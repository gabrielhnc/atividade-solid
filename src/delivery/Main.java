package delivery;

import delivery.model.Bebida;
import delivery.model.Hamburguer;
import delivery.model.Pedido;
import delivery.model.Pizza;
import delivery.repository.PedidoRepository;
import delivery.service.gestao.*;
import delivery.service.notificacao.INotificador;
import delivery.service.notificacao.INotificavel;
import delivery.service.notificacao.NotificacaoWhatsapp;
import delivery.service.notificacao.ServicoNotificacao;
import delivery.service.pagamento.IFormaPagamento;
import delivery.service.pagamento.PagamentoPix;
import delivery.view.PedidoView;

public class Main {
    static void main() {
        Pedido pedido = new Pedido(101);
        pedido.adicionarProduto(new Pizza("Calabresa", 45.90, "Média"));
        pedido.adicionarProduto(new Hamburguer("Artesanal", 32.00, true));
        pedido.adicionarProduto(new Bebida("Coca-Cola", 8.50, 500));

        PedidoView printer = new PedidoView();
        printer.exibir(pedido);

        PedidoRepository repository = new PedidoRepository();
        repository.salvar(pedido);

        IFormaPagamento pagamento = new PagamentoPix();
        pagamento.processarPagamento(pedido.getValorTotal());

        IGerenciadorPedido gerenciadorPedido = new ServicoPedido();
        gerenciadorPedido.criarPedido();

        IGerenciadorEntrega entrega = new ServicoEntrega();
        entrega.enviarEntrega();
        entrega.rastrearEntrega();

        IGeradorRelatorio relatorio = new RelatorioVendas();
        relatorio.gerarRelatorio();

        INotificador canal = new NotificacaoWhatsapp();
        INotificavel notificacao = new ServicoNotificacao(canal);
        notificacao.notificarCliente("Seu pedido saiu para entrega!");
    }
}
