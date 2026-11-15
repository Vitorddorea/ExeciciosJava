package basicoAPoo.nivel2;

public class AnaliseNumeros {
    public static void main(String[] args) {
        int[] numeros = {12, 5, 8, 21, 3, 17, 10};

        int maior = numeros[0];
        int menor = numeros[0];
        int somaTodos = 0;
        int pares = 0;
        int impares = 0;

        for(int i = 0; i < numeros.length; i++){
            if(maior < numeros[i]){
                maior = numeros[i];
            }

            if(menor > numeros[i]){
                menor = numeros[i];
            }

            if (numeros[i] % 2 == 0){
                pares++;
            }else {
                impares++;
            }

            somaTodos += numeros[i];

        }

        double media = (double) somaTodos / numeros.length;

        System.out.println("Maior " + maior);
        System.out.println("Menor " + menor);
        System.out.println("Soma dos números " + somaTodos);
        System.out.println("Media " + media);
        System.out.println("Pares " + pares);
        System.out.println("impares " + impares);
    }
}
