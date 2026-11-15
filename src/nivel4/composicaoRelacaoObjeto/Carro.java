package nivel4.composicaoRelacaoObjeto;

public class Carro {
    private String modelo;
    private int ano;
    private Motor motor;

    public Carro(String modelo, int ano, Motor motor) {
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }

    public void apresentarCarro(){
        System.out.println("Carro: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Motor: ");
        motor.apresentarMotor();
    }
}
