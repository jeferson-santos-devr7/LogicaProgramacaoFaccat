package faccat;

import java.util.Scanner;

public class L01F47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            double valor = scanner.nextDouble();
            soma += valor;
        }

        double media = soma / 10.0;
        System.out.printf("A média aritmética dos valores é: %.2f%n", media);

        scanner.close();
    }
}