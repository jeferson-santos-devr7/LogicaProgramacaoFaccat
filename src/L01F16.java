package faccat;

import java.util.Scanner;

public class L01F16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º valor: ");
        int v1 = scanner.nextInt();

        System.out.print("Digite o 2º valor: ");
        int v2 = scanner.nextInt();

        System.out.print("Digite o 3º valor: ");
        int v3 = scanner.nextInt();

        int maior;

        if (v1 > v2 && v1 > v3) {
            maior = v1;
        } else if (v2 > v3) {
            maior = v2;
        } else {
            maior = v3;
        }

        System.out.println("O maior valor é: " + maior);

        scanner.close();
    }
}