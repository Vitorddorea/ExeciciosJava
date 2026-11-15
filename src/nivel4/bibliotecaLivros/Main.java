package nivel4.bibliotecaLivros;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Azul");

        Livro livro1 = new Livro("Duna", "Frank Herbert", 1965);
        Livro livro2 = new Livro("O Pequeno Príncipe", "Antoine de Saint‑Exupéry",1943);
        Livro livro3 = new Livro("It: A Coisa", "Stephen King", 1986);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        System.out.println("============");

        biblioteca.buscarLivro("duna");
        biblioteca.buscarLivro("asd");

        System.out.println("============");
        biblioteca.removerLivro("O Pequeno Príncipe");
        biblioteca.removerLivro("duae");

        System.out.println("============");
        biblioteca.listarLivros();
    }
}
