package faccat;

import java.util.Scanner;

public class L01F36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor (diferente de zero): ");
        double valor2 = scanner.nextDouble();

        while (valor2 == 0) {
            System.out.println("VALOR INVÁLIDO");
            System.out.print("Digite novamente o segundo valor: ");
            valor2 = scanner.nextDouble();
        }

        double divisao = valor1 / valor2;
        System.out.printf("O resultado da divisão é: %.2f%n", divisao);

        scanner.close();
    }
}