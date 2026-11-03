package faccat;

import java.util.Scanner;

public class L01F35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        double valor2;
        do {
            System.out.print("Digite o segundo valor (diferente de zero): ");
            valor2 = scanner.nextDouble();
            if (valor2 == 0) {
                System.out.println("VALOR INVÁLIDO! O segundo valor não pode ser zero.");
            }
        } while (valor2 == 0);

        double divisao = valor1 / valor2;
        System.out.printf("O resultado da divisão é: %.2f%n", divisao);

        scanner.close();
    }
}