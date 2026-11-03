package faccat;

import java.util.Scanner;

public class L01F06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        double percDistribuidor = 0.28;
        double impostos = 0.45;

        double custoFinal = custoFabrica + (custoFabrica * percDistribuidor) + (custoFabrica * impostos);

        System.out.println("O custo final ao consumidor é: R$ " + custoFinal);

        scanner.close();
    }
}