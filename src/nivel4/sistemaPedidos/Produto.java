package nivel4.sistemaPedidos;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;

        if (preco <= 0) {
            throw new IllegalArgumentException("Preço deve ser maior que zero");
        }

        this.preco = preco;
    }

    public void apresentarProduto(){
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
