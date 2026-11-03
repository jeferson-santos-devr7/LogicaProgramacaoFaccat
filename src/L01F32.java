package faccat;

import java.util.Scanner;

public class L01F32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double v1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double v2 = scanner.nextDouble();

        if (v1 == v2) {
            System.out.println("Números iguais");
        } else if (v1 > v2) {
            System.out.println("Primeiro é maior");
        } else {
            System.out.println("Segundo é maior");
        }

        scanner.close();
    }
}