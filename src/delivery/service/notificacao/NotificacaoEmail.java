package delivery.service.notificacao;

public class NotificacaoEmail implements INotificador {

    @Override
    public void enviar(String mensagem) {
        System.out.println("[E-MAIL] Enviando: " + mensagem);
    }
}
