package nivel5.funcionariosCalculos;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.15;
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Departamento: " + departamento);
    }
}
