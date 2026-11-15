package basicoAPoo.nivel3.contaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("Claudio", 123);

        contaBancaria.consultarSaldo();
        contaBancaria.depositar(500);
        contaBancaria.consultarSaldo();
        contaBancaria.sacar(150);
        contaBancaria.consultarSaldo();
        contaBancaria.sacar(500);
        contaBancaria.sacar(-100);
    }
}
