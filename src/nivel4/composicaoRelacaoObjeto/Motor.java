package nivel4.composicaoRelacaoObjeto;

public class Motor {
    private String marca;
    private String modelo;
    private int cilindros;

    public Motor(String marca, String modelo, int cilindros) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindros = cilindros;
    }

    public void apresentarMotor(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cilindros: " + cilindros);
    }
}
