package delivery.service.notificacao;

public class ServicoNotificacao implements INotificavel {

    private final INotificador meioNotificacao;

    public ServicoNotificacao(INotificador meioNotificacao) {
        this.meioNotificacao = meioNotificacao;
    }

    @Override
    public void notificarCliente(String mensagem) {
        this.meioNotificacao.enviar(mensagem);
    }
}
