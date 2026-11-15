package basicoAPoo.nivel5.sistemaVeiculos;

public class Carro extends Veiculo{
    private double consumoPorKm;

    public Carro(String marca, String modelo, double consumoPorKm) {
        super(marca, modelo);
        setConsumoPorKm(consumoPorKm);
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        return distancia * consumoPorKm * 6.00;
    }

    public double getConsumoPorKm() {
        return consumoPorKm;
    }

    public void setConsumoPorKm(double consumoPorKm) {
        if (consumoPorKm <= 0){
            throw new IllegalArgumentException("valor inválido");
        }
        this.consumoPorKm = consumoPorKm;
    }
}
