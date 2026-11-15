package nivel4.alunoEndereco;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Aurora", 23, "Mogi");

        Aluno aluno = new Aluno("Marcos", 123, endereco);

        aluno.apresentarAluno();
    }
}
