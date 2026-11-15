package basicoAPoo.nivel1;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = sc.nextInt();

        System.out.println("Contagem: ");
        for (int i = 1; i <= num; i++){
            System.out.println(i);
        }

        System.out.println("----------------");
        System.out.println("Números pares: ");
        for (int i = 1; i <= num; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
