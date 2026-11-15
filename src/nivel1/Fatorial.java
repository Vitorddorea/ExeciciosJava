package nivel1;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Fatorial");

        System.out.println("Digite um número inteiro positivo:");
        int num = sc.nextInt();

        int resultado = 1;

        for (int i = num; i >= 1; i--){
            resultado *= i;
        }

        System.out.println(resultado);

    }
}
