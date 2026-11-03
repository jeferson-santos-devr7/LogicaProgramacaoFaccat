package faccat;

import java.util.Scanner;

public class L01F45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negativos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            double valor = scanner.nextDouble();

            if (valor < 0) {
                negativos++;
            }
        }

        System.out.println("Total de valores negativos lidos: " + negativos);

        scanner.close();
    }
}