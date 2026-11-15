package basicoAPoo.nivel3.cadastroPessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Alice", 20, 1.65);

        pessoa1.setIdade(-5);
        pessoa1.setAltura(0);
        pessoa1.setNome("   ");

        pessoa1.apresentar();

    }
}
