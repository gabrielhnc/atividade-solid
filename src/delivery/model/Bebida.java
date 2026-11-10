package delivery.model;

public class Bebida extends Produto {
    private int ml;

    public Bebida(String nome, double preco, int ml) {
        super(nome, preco);
        this.ml = ml;
    }

    @Override
    public String getDetalhes() {
        return getNome() + " (" + ml + "ml) - R$ " + String.format("%.2f", getPreco());
    }
}
