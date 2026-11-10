package delivery.model;

public class Hamburguer extends Produto {
    private boolean artesanal;

    public Hamburguer(String nome, double preco, boolean artesanal) {
        super(nome, preco);
        this.artesanal = artesanal;
    }

    @Override
    public String getDetalhes() {
        String tipo = artesanal ? "Artesanal" : "Tradicional";
        return getNome() + " (" + tipo + ") - R$ " + String.format("%.2f", getPreco());
    }
}
