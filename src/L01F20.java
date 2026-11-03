package faccat;

import java.util.Scanner;

public class L01F20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tipo de combustível (A para Álcool, G para Gasolina): ");
        char tipo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite o número de litros vendidos: ");
        double litros = scanner.nextDouble();

        double total = 0;

        if (tipo == 'A') {
            double preco = 2.90;
            if (litros <= 20) {
                total = litros * (preco - (preco * 0.03));
            } else {
                total = litros * (preco - (preco * 0.05));
            }
        } else if (tipo == 'G') {
            double preco = 3.30;
            if (litros <= 20) {
                total = litros * (preco - (preco * 0.04));
            } else {
                total = litros * (preco - (preco * 0.06));
            }
        } else {
            System.out.println("Tipo de combustível inválido!");
            scanner.close();
            return;
        }

        System.out.printf("O valor total a ser pago é: R$ %.2f%n", total);

        scanner.close();
    }
}