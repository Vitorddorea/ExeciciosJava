package basicoAPoo.nivel4.composicaoRelacaoObjeto;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("Toyota", "2.0 Dynamic Force", 4);

        Carro carro = new Carro("Corolla", 2024, motor);

        carro.apresentarCarro();
    }
}
