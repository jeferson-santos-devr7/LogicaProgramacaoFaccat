package faccat;

import java.util.Scanner;

public class L01F22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de morangos (kg): ");
        double kgMorangos = scanner.nextDouble();

        System.out.print("Digite a quantidade de maçãs (kg): ");
        double kgMacas = scanner.nextDouble();

        double precoMorango = (kgMorangos <= 5) ? 2.50 : 2.20;
        double precoMaca = (kgMacas <= 5) ? 1.80 : 1.50;

        double totalMorango = kgMorangos * precoMorango;
        double totalMaca = kgMacas * precoMaca;

        double kgTotal = kgMorangos + kgMacas;
        double valorTotal = totalMorango + totalMaca;

        if (kgTotal > 8 || valorTotal > 25.00) {
            valorTotal = valorTotal - (valorTotal * 0.10);
        }

        System.out.printf("O valor a ser pago é: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}