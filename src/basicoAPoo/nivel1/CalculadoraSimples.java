package basicoAPoo.nivel1;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULADORA");

        System.out.println("Primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.println("Segundo número:");
        double num2 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Operação (+, -, *, /) : ");
        String operacao = sc.nextLine();

        switch (operacao){
            case "+"-> {
                System.out.println(num1 + num2);
            }
            case "-" -> {
                System.out.println(num1 - num2);
            }
            case "*" -> {
                System.out.println(num1 * num2);
            }
            case "/" -> {
                if (num2 == 0){
                    System.out.println("Operação ínvalida! Divisão por zero");
            }else {
                    System.out.println(num1 / num2);
                }
            }
            default -> System.out.println("Operação Ínvalida!");
        }
    }
}
