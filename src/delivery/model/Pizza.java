package delivery.model;

public class Pizza extends Produto {
    private String tamanho;

    public Pizza(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String getDetalhes() {
        return getNome() + " (Tamanho: " + tamanho + ") - R$ " + String.format("%.2f", getPreco());
    }
}
