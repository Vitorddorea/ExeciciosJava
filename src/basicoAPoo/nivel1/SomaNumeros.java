package basicoAPoo.nivel1;

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        int resultado = 0;

        for (int i = 1; i <= num; i++){
            resultado += i;
        }
        System.out.println(resultado);
    }
}
