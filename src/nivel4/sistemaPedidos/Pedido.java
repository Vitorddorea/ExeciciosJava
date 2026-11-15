package nivel4.sistemaPedidos;

import java.util.ArrayList;

public class Pedido {
    private int numero;
    private ArrayList<Produto> produtos;

    public Pedido(int numero) {
        this.numero = numero;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void listarProdutos() {
        for(Produto produto : produtos){
            produto.apresentarProduto();
        }
    }

    public double calcularTotal() {
        double total = 0;

        for (Produto produto : produtos){
            total += produto.getPreco();
        }
        return total;
    }
}
