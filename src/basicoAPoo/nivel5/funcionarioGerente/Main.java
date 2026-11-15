package basicoAPoo.nivel5.funcionarioGerente;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Marcos", 2333.94);
        Funcionario gerente = new Gerente("Natalia", 5456.6, "Azul");

        funcionario.apresentarDados();
        gerente.apresentarDados();
    }
}
