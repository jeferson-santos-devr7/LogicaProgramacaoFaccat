package faccat;

import java.util.Scanner;

public class L01F19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int senhaCadastrada = 1234;

        System.out.print("Digite a senha de 4 dígitos: ");
        int senhaDigitada = scanner.nextInt();

        if (senhaDigitada == senhaCadastrada) {
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Acesso Negado");
        }

        scanner.close();
    }
}