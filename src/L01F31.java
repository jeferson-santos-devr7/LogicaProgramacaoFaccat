package faccat;

import java.util.Scanner;

public class L01F31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do Time 1: ");
        String time1 = scanner.next();
        System.out.print("Digite os gols do " + time1 + ": ");
        int gols1 = scanner.nextInt();

        System.out.print("Digite o nome do Time 2: ");
        String time2 = scanner.next();
        System.out.print("Digite os gols do " + time2 + ": ");
        int gols2 = scanner.nextInt();

        if (gols1 > gols2) {
            System.out.println("Vencedor: " + time1);
        } else if (gols2 > gols1) {
            System.out.println("Vencedor: " + time2);
        } else {
            System.out.println("EMPATE");
        }

        scanner.close();
    }
}