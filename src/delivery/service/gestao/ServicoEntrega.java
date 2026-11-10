package delivery.service.gestao;

public class ServicoEntrega implements IGerenciadorEntrega {

    @Override
    public void enviarEntrega() {
        System.out.println("Pedido enviado!");
    }

    @Override
    public void rastrearEntrega() {
        System.out.println("Status da entrega: A caminho.");
    }
}
