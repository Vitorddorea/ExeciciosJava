package basicoAPoo.nivel5.funcionariosCalculos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Augusto", 2345);
        Funcionario gerente = new Gerente("Felipe", 233243, "tecnologia");
        Funcionario desenvolvedor = new Desenvolvedor("Lisa", 22445, "Java");

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(funcionario1);
        funcionarios.add(gerente);
        funcionarios.add(desenvolvedor);

        for (Funcionario funcionario : funcionarios){
            funcionario.apresentarDados();
            System.out.println("-------------");
        }
    }
}
