package faccat;

import java.util.Scanner;

public class L01F25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade atual em estoque: ");
        int qtdAtual = scanner.nextInt();

        System.out.print("Digite a quantidade máxima em estoque: ");
        int qtdMax = scanner.nextInt();

        System.out.print("Digite a quantidade mínima em estoque: ");
        int qtdMin = scanner.nextInt();

        double qtdMedia = (double) (qtdMax + qtdMin) / 2;

        System.out.printf("Quantidade Média: %.2f%n", qtdMedia);

        if (qtdAtual >= qtdMedia) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }

        scanner.close();
    }
}