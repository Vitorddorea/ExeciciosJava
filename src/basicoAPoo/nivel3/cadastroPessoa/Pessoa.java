package basicoAPoo.nivel3.cadastroPessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura){
        setNome(nome);
        setIdade(idade);
        setAltura(altura);
    }

    public void apresentar(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()){
            System.out.println("Nome ínvalido");
        }else {
            this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade >= 0){
            this.idade = idade;
        }else{
            System.out.println("Idade ínvalida");
        }

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0){
            this.altura = altura;
        }else{
            System.out.println("Altura ínvalida");
        }
    }
}
