package faccat;

import java.util.Scanner;

public class L01F05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual: ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite o percentual de reajuste: ");
        double reajuste = scanner.nextDouble();

        double novoSalario = salarioAtual + (salarioAtual * reajuste / 100);

        System.out.println("O novo salário é: R$ " + novoSalario);

        scanner.close();
    }
}