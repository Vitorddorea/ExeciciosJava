package basicoAPoo.nivel2;

public class NotasTurma {
    public static void main(String[] args) {
        double[] notas = {6.7, 8.6, 9.2, 4.5, 3.6};

        System.out.println(calcularMedia(notas));
        System.out.println(encontrarMaiorNota(notas));
        System.out.println(encontrarMenorNota(notas));
        System.out.println(contarAprovados(notas));
    }

    public static double calcularMedia(double[] notas){
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma+= notas[i];
        }

        return soma/ notas.length;
    }

    public static double encontrarMaiorNota(double[] notas){
        double maior = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if(notas[i] > maior){
                maior = notas[i];
            }
        }
        return maior;
    }

    public static double encontrarMenorNota(double[] notas){
        double menor = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if(notas[i] < menor){
                menor = notas[i];
            }
        }
        return menor;
    }

    public static int contarAprovados(double[] notas){
        int aprovados = 0;

        for (int i = 0; i < notas.length; i++){
            if(notas[i] >= 6){
                aprovados++;
            }
        }
        return aprovados;
    }
}
