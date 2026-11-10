package delivery.service.gestao;

public class RelatorioVendas implements IGeradorRelatorio {

    @Override
    public void gerarRelatorio() {
        System.out.println("--- RELATÓRIO DE VENDAS DO DIA ---");
        System.out.println("Total de pedidos processados: X");
    }
}
