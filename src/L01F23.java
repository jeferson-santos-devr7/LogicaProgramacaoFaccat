package faccat;

import java.util.Scanner;

public class L01F23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.next();

        System.out.print("Digite o sexo (M para Masculino, F para Feminino): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite a altura (ex: 1.75): ");
        double altura = scanner.nextDouble();

        double pesoIdeal = 0;

        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido!");
            scanner.close();
            return;
        }

        System.out.printf("%s, o seu peso ideal é: %.2f kg%n", nome, pesoIdeal);

        scanner.close();
    }
}