package faccat;

import java.util.Scanner;

public class L01F37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1;
        do {
            System.out.print("Digite a nota da 1ª avaliação (0 a 10): ");
            nota1 = scanner.nextDouble();
            if (nota1 < 0 || nota1 > 10) {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
            }
        } while (nota1 < 0 || nota1 > 10);

        double nota2;
        do {
            System.out.print("Digite a nota da 2ª avaliação (0 a 10): ");
            nota2 = scanner.nextDouble();
            if (nota2 < 0 || nota2 > 10) {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
            }
        } while (nota2 < 0 || nota2 > 10);

        double media = (nota1 + nota2) / 2.0;
        System.out.printf("A média simples do aluno é: %.2f%n", media);

        scanner.close();
    }
}
