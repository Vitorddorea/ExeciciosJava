package nivel1;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para saber se ele é primo: ");
        int num = sc.nextInt();

        int contador = 0;

        for (int i = 1; i >= num; i++){
            if (num % i == 0){
                contador++;
            }
        }

        if (contador == 2){
            System.out.println("É primo");
        }else {
            System.out.println("Não é primo");
        }

    }
}
