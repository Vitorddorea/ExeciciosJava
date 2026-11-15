package nivel4.alunoEndereco;

public class Aluno {
    private String nome;
    private int matricula;
    private Endereco endereco;

    public Aluno(String nome, int matricula, Endereco endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;
    }

    public void apresentarAluno(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Endereço: ");
        endereco.apresentarEndereco();
    }
}
