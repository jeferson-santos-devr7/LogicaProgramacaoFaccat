package faccat;

import java.util.Scanner;

public class L01F17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º valor: ");
        int v1 = scanner.nextInt();

        System.out.print("Digite o 2º valor: ");
        int v2 = scanner.nextInt();

        System.out.print("Digite o 3º valor: ");
        int v3 = scanner.nextInt();

        int soma;

        if (v1 < v2 && v1 < v3) {
            soma = v2 + v3;
        } else if (v2 < v1 && v2 < v3) {
            soma = v1 + v3;
        } else {
            soma = v1 + v2;
        }

        System.out.println("A soma dos dois maiores valores é: " + soma);

        scanner.close();
    }
}