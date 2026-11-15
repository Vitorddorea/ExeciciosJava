package basicoAPoo.nivel2;

import java.util.Scanner;

public class Buscador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = {10, 25, 8, 42, 17, 30};

        System.out.println("Buscador de números");

        System.out.println("Digite o número que você quer encontrar: ");
        int num = sc.nextInt();

        int posicao = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (num == numeros[i]) {
                posicao = i ;
                break;
            }
        }

        if(posicao != -1){
            System.out.println("Número encontrado!");
            System.out.println("Posição: " + (posicao + 1));
        }else {
            System.out.println("Número não encontrado.");
        }
    }
}
