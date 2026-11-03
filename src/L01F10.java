package faccat;

import java.util.Scanner;

public class L01F10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        if (idade >= 16) {
            System.out.println("Você poderá votar este ano!");
        } else {
            System.out.println("Você NÃO poderá votar este ano!");
        }

        scanner.close();
    }
}