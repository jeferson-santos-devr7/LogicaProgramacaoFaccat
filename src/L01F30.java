package faccat;

import java.util.Scanner;

public class L01F30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o lado B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o lado C: ");
        double c = scanner.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Os lados FORMAM um triângulo.");
        } else {
            System.out.println("Os lados NÃO formam um triângulo.");
        }

        scanner.close();
    }
}