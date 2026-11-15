package basicoAPoo.nivel5.sistemaVeiculos;

public class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public double calcularCustoViagem(double distancia){
        return distancia * 0.50;
    }

    public void apresentarDados(double distancia){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Custo da viagem: " + calcularCustoViagem(distancia));
    }
}
