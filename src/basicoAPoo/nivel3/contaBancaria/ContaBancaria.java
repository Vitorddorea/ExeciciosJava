package basicoAPoo.nivel3.contaBancaria;

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public void depositar(double valor){
        if (valor > 0){
            setSaldo(saldo + valor);
            System.out.println("Deposito realizado!");
        }else {
            System.out.println("Deposite um valor válido!");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            setSaldo(saldo - valor);;
            System.out.println("Saque realizado!");
        }else if (valor <= 0){
            System.out.println("Valor ínvalido");
        }else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo: R$" + getSaldo());
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
