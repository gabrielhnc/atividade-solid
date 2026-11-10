package delivery.service.notificacao;

public class NotificacaoSMS implements INotificador {

    @Override
    public void enviar(String mensagem) {
        System.out.println("[SMS] Enviando: " + mensagem);
    }
}
