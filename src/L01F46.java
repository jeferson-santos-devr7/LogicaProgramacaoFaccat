package faccat;

import java.util.Scanner;

public class L01F46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dentro = 0;
        int fora = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            double valor = scanner.nextDouble();

            if (valor >= 10 && valor <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }

        System.out.println("Valores dentro do intervalo [10, 20]: " + dentro);
        System.out.println("Valores fora do intervalo: " + fora);

        scanner.close();
    }
}