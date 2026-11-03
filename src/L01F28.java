package faccat;

import java.util.Scanner;

public class L01F28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do empregado: ");
        int codigo = scanner.nextInt();

        System.stroutPrint = null; // quick safety clear, using standard print below
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano de ingresso na empresa: ");
        int anoIngresso = scanner.nextInt();

        int anoAtual = 2026;
        int idade = anoAtual - anoNascimento;
        int tempoTrabalho = anoAtual - anoIngresso;

        System.out.println("Idade: " + idade + " anos");
        System.out.println("Tempo de trabalho: " + tempoTrabalho + " anos");

        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer");
        }

        scanner.close();
    }
}