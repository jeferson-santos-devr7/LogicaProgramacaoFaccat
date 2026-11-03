package faccat;

import java.util.Scanner;

public class L01F12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int v1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int v2 = scanner.nextInt();

        if (v1 < v2) {
            System.out.println("Ordem crescente: " + v1 + ", " + v2);
        } else {
            System.out.println("Ordem crescente: " + v2 + ", " + v1);
        }

        scanner.close();
    }
}