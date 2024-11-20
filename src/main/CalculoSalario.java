package src.main;

import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe a quantidade de horas trabalhadas por dia: ");
        double horasPorDia = scanner.nextDouble();

        System.out.print("Informe o preço da hora trabalhada (em reais): ");
        double precoHora = scanner.nextDouble();

        System.out.print("Informe a quantidade de dias trabalhados no mês: ");
        int diasTrabalhados = scanner.nextInt();

        // Cálculo do salário bruto
        double salarioBruto = horasPorDia * precoHora * diasTrabalhados;

        // Cálculo do desconto (21%)
        double desconto = salarioBruto * 0.21;

        // Cálculo do salário líquido
        double salarioLiquido = salarioBruto - desconto;

        // Exibição do resultado
        System.out.println("Salário Bruto: R$ " + String.format("%.2f", salarioBruto));
        System.out.println("Desconto (21%): R$ " + String.format("%.2f", desconto));
        System.out.println("Salário Líquido: R$ " + String.format("%.2f", salarioLiquido));

        scanner.close();
    }
}
