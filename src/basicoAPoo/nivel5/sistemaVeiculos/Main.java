package basicoAPoo.nivel5.sistemaVeiculos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Fiat", "Mob");
        Veiculo carro = new Carro("Honda", "Fit", 34);
        Veiculo moto = new Moto("Suzuki", "motinha", 5);

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(veiculo1);
        veiculos.add(carro);
        veiculos.add(moto);

        for (Veiculo veiculo : veiculos){
            veiculo.apresentarDados(100);
            System.out.println("--------------------");
        }
    }
}
