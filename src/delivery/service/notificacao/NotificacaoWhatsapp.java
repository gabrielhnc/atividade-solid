package delivery.service.notificacao;

public class NotificacaoWhatsapp implements INotificador {

    @Override
    public void enviar(String mensagem) {
        System.out.println("[WHATSAPP] Enviando: " + mensagem);
    }
}
