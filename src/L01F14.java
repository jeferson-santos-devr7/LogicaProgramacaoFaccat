package faccat;

import java.util.Scanner;

public class L01F14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasMes = scanner.nextDouble();

        System.out.print("Digite o valor recebido por hora: ");
        double salarioHora = scanner.nextDouble();

        // 4 semanas no mês -> horas semanais = horasMes / 4
        double horasSemanal = horasMes / 4.0;
        double salarioTotal;

        if (horasSemanal > 40) {
            double horasExtras = (horasSemanal - 40) * 4; // Total de horas extras no mês
            double valorHoraExtra = salarioHora * 1.50;
            double normalMes = 160 * salarioHora; // 40 horas * 4 semanas = 160 horas normais
            double extraMes = horasExtras * valorHoraExtra;
            salarioTotal = normalMes + extraMes;
        } else {
            salarioTotal = horasMes * salarioHora;
        }

        System.out.printf("O salário total do funcionário é: R$ %.2f%n", salarioTotal);

        scanner.close();
    }
}