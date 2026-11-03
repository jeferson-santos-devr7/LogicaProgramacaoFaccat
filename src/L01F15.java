package faccat;

import java.util.Scanner;

public class L01F15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();

        if (valor > 0) {
            System.out.println("O valor é POSITIVO.");
        } else if (valor < 0) {
            System.out.println("O valor é NEGATIVO.");
        } else {
            System.out.println("O valor é ZERO.");
        }

        scanner.close();
    }
}