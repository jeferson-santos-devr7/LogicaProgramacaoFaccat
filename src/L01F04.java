package faccat;

import java.util.Scanner;

public class L01F04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        System.out.print("Digite o número de votos brancos: ");
        int brancos = scanner.nextInt();

        System.out.print("Digite o número de votos nulos: ");
        int nulos = scanner.nextInt();

        System.out.print("Digite o número de votos válidos: ");
        int validos = scanner.nextInt();

        double percBrancos = (double) brancos / totalEleitores * 100;
        double percNulos = (double) nulos / totalEleitores * 100;
        double percValidos = (double) validos / totalEleitores * 100;

        System.out.println("Percentual de votos brancos: " + percBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percNulos + "%");
        System.out.println("Percentual de votos válidos: " + percValidos + "%");

        scanner.close();
    }
}