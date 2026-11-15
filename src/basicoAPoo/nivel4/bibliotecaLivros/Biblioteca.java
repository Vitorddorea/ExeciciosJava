package basicoAPoo.nivel4.bibliotecaLivros;

import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private ArrayList<Livro> livros;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void listarLivros(){
        for(Livro livro : livros){
            livro.apresentarLivro();
        }
    }

    public void buscarLivro(String titulo) {
        Livro livroEncontrado = null;

        for(Livro livro : livros){
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
                livroEncontrado = livro;
                break;
            }
        }

        if (livroEncontrado == null){
            System.out.println("Livro não existe");
        }else {
            livroEncontrado.apresentarLivro();
        }
    }

    public void removerLivro(String titulo){
        Livro livroEncontrado = null;

        for(Livro livro : livros){
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livroEncontrado = livro;
                break;
            }
        }

        if (livroEncontrado == null){
            System.out.println("Livro não existe");
        }else {
            livros.remove(livroEncontrado);
            System.out.println("Livro removido com sucesso!");
        }
    }
}
