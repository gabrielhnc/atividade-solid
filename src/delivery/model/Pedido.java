package delivery.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Integer id;
    private List<Produto> produtos;

    public Pedido(Integer id) {
        this.id = id;
        this.produtos = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public double getValorTotal() {
        double total = 0.0;

        for (Produto p : produtos) {
            total += p.getPreco();
        }

        return total;
    }
}
