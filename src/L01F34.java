package faccat;

import java.util.Scanner;

public class L01F34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o lado B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o lado C: ");
        double c = scanner.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || b == c || a == c) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Não é possível formar um triângulo");
        }

        scanner.close();
    }
}