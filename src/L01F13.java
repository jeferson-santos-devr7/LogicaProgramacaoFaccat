package faccat;

import java.util.Scanner;

public class L01F13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora de início (0 a 24): ");
        int horaInicio = scanner.nextInt();

        System.out.print("Digite a hora de fim (0 a 24): ");
        int horaFim = scanner.nextInt();

        int duracao;

        if (horaFim > horaInicio) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = (24 - horaInicio) + horaFim;
        }

        System.out.println("O jogo durou " + duracao + " hora(s).");

        scanner.close();
    }
}