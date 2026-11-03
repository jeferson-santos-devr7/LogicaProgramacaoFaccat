package faccat;

import java.util.Scanner;

public class L01F24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o débito: ");
        double debito = scanner.nextDouble();

        System.out.print("Digite o crédito: ");
        double credito = scanner.nextDouble();

        double saldoAtual = saldo - debito + credito;

        System.out.printf("Saldo Atual: R$ %.2f%n", saldoAtual);

        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }

        scanner.close();
    }
}
