package basicoAPoo.nivel5.funcionarioGerente;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void apresentarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + salario);

    }
}
