package faccat;

import java.util.Scanner;

public class L01F01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int antecessor = numero - 1;

        System.out.println("O antecessor de " + numero + " é: " + antecessor);

        scanner.close();
    }
}