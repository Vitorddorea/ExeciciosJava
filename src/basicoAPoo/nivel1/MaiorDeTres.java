package basicoAPoo.nivel1;

import java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Terceiro número: ");
        int num3 = sc.nextInt();

        int maior = num1;

        if (num2 > maior ){
            maior = num2;
        }

        if (num3 > maior ) {
            maior = num3;
        }

        System.out.println("Maior número digitado: " + maior);

    }
}
