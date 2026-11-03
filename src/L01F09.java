package faccat;

import java.util.Scanner;

public class L01F09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da 1ª avaliação: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da 2ª avaliação: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2.0;

        System.out.printf("Média do aluno: %.2f%n", media);

        if (media >= 6.0) {
            System.out.println("Aluno APROVADO!");
        } else {
            System.out.println("Aluno REPROVADO!");
        }

        scanner.close();
    }
}