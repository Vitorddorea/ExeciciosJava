package basicoAPoo.nivel5.funcionariosCalculos;

public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;

    public Desenvolvedor(String nome, double salario, String linguagemPrincipal) {
        super(nome, salario);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.10;
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Linguagem: " + linguagemPrincipal);
    }
}
