package basicoAPoo.nivel2;

public class EncontrarMaiorNumero {
    public static void main(String[] args) {
        int[] numeros = {10, 50, 3, 28, 17, 65, 4};

        System.out.println(encontrarMaior(numeros));
    }

    public static int encontrarMaior(int[] numeros){
        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }
        return maior;
    }
}
