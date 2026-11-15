package basicoAPoo.nivel5.funcionariosCalculos;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        setSalario(salario);
    }

    public double calcularBonus(){
        return salario * 0.05;
    }

    public void apresentarDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalario());
        System.out.println("Bônus: " + calcularBonus());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <= 0){
            throw new IllegalArgumentException("Salário inválido!");
        }
        this.salario = salario;
    }
}
