package faccat;

import java.util.Scanner;

public class L01F26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a descrição do produto: ");
        String produto = scanner.next();

        System.out.print("Digite a quantidade adquirida: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o preço unitário: ");
        double precoUnitario = scanner.nextDouble();

        double total = quantidade * precoUnitario;
        double percentualDesconto;

        if (quantidade <= 5) {
            percentualDesconto = 0.02;
        } else if (quantidade <= 10) {
            percentualDesconto = 0.03;
        } else {
            percentualDesconto = 0.05;
        }

        double desconto = total * percentualDesconto;
        double totalAPagar = total - desconto;

        System.out.printf("Total bruto: R$ %.2f%n", total);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Total a pagar por %s: R$ %.2f%n", produto, totalAPagar);

        scanner.close();
    }
}