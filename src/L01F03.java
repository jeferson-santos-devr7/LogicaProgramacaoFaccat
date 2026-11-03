package faccat;

import java.util.Scanner;

public class L01F03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os anos completos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite os meses vividos desde o último aniversário: ");
        int meses = scanner.nextInt();

        System.out.print("Digite os dias vividos desde o último mêsversário: ");
        int dias = scanner.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("A sua idade total em dias é: " + totalDias + " dias.");

        scanner.close();
    }
}
