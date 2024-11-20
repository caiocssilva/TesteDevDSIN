package src.main;

import java.util.Locale;
import java.util.Scanner;

public class CalculoDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Entrada de dados
        System.out.print("Digite a descrição do item: ");
        String descricao = scanner.nextLine();

        System.out.print("Digite a quantidade adquirida: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o preço por unidade (em reais): ");
        double precoUnitario = scanner.nextDouble();

        // Cálculo do total sem desconto
        double total = quantidade * precoUnitario;

        // Determinação do percentual de desconto
        double percentualDesconto;
        if (quantidade <= 5) {
            percentualDesconto = 5.55;
        } else if (quantidade <= 10) {
            percentualDesconto = 8.0;
        } else {
            percentualDesconto = 12.5;
        }

        // Cálculo do desconto
        double desconto = total * (percentualDesconto / 100);

        // Cálculo do total a pagar
        double totalAPagar = total - desconto;

        // Exibição dos resultados
        System.out.println("\n--- Resumo da Compra ---");
        System.out.println("Descrição do item: " + descricao);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço unitário: R$ " + String.format("%.2f", precoUnitario));
        System.out.println("Total sem desconto: R$ " + String.format("%.2f", total));
        System.out.println("Percentual de desconto: " + percentualDesconto + "%");
        System.out.println("Valor do desconto: R$ " + String.format("%.2f", desconto));
        System.out.println("Total a pagar: R$ " + String.format("%.2f", totalAPagar));

        scanner.close();
    }
}

