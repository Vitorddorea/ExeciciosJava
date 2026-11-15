package basicoAPoo.nivel4.sistemaPedidos;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 12.39);
        Produto produto2 = new Produto("Feijão", 6.59);
        Produto produto3 = new Produto("Frango", 10.99);

        Pedido pedido = new Pedido(1);

        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        pedido.adicionarProduto(produto3);

        pedido.listarProdutos();
        System.out.println("Total do pedido: R$" + pedido.calcularTotal());
    }
}
