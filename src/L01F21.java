package faccat;

import java.util.Scanner;

public class L01F21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do 1º homem: ");
        int h1 = scanner.nextInt();
        System.out.print("Digite a idade do 2º homem: ");
        int h2 = scanner.nextInt();

        System.out.print("Digite a idade da 1ª mulher: ");
        int m1 = scanner.nextInt();
        System.out.print("Digite a idade da 2ª mulher: ");
        int m2 = scanner.nextInt();

        int homemMaisVelho = Math.max(h1, h2);
        int homemMaisNovo = Math.min(h1, h2);
        int mulherMaisVelha = Math.max(m1, m2);
        int mulherMaisNova = Math.min(m1, m2);

        int soma = homemMaisVelho + mulherMaisNova;
        int produto = homemMaisNovo * mulherMaisVelha;

        System.out.println("Soma (homem mais velho + mulher mais nova): " + soma);
        System.out.println("Produto (homem mais novo * mulher mais velha): " + produto);

        scanner.close();
    }
}