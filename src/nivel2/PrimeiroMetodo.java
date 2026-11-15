package nivel2;

public class PrimeiroMetodo {
    public static void main(String[] args) {
        int[] numeros = {3, 8, 15, 22, 31, 40};

        System.out.println("Números pares: ");
        for (int i = 0; i < numeros.length; i++) {
            if(ehPar(numeros[i])){
                System.out.println(numeros[i]);
            }
        }
        System.out.println("Quantidade de pares: " + contarPares(numeros));

        System.out.println();

        System.out.println("Números ímpares: ");
        for (int i = 0; i < numeros.length; i++){
            if(ehImpar(numeros[i])) {
                System.out.println(numeros[i]);
            }
        }
    }

    public static boolean ehPar(int numero){
        return numero % 2 == 0;
    }

    public static boolean ehImpar(int numero){
        return numero % 2 != 0;
    }

    public static int contarPares(int[] numeros){
        int pares = 0;

        for (int i = 0; i < numeros.length; i++){
            if(ehPar(numeros[i])){
                pares++;
            }
        }
        return pares;
    }

}
