package src.main;

import java.util.Scanner;

public class PlacaVeiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicita a placa
            System.out.print("Digite a placa: ");
            String placa = scanner.nextLine().toUpperCase();

            // Validação do formato da placa
            if (placa.matches("[A-Z]{3}[0-9]{4}")) {
                // Padrão Brasil (AAA9999)
                System.out.println("Padrão: Brasil;");
                // Conversão para Mercosul (AAA9A99)
                // Substituindo o número na 4ª posição por uma letra 'C' e mantendo as outras posições
                String correspondente = placa.substring(0, 3) + placa.charAt(3) + "C" + placa.substring(4, 7);
                System.out.println("Correspondente: " + correspondente);
            } else if (placa.matches("[A-Z]{3}[0-9][A-Z][0-9]{2}")) {
                // Padrão Mercosul (AAA9A99)
                System.out.println("Padrão: Mercosul;");
                // Conversão para Brasil (AAA9999)
                // Substituindo a letra na 4ª posição por um número '1' e mantendo as outras posições
                String correspondente = placa.substring(0, 3) + placa.charAt(3) + placa.charAt(4) + placa.substring(5);
                System.out.println("Correspondente: " + correspondente);
            } else {
                // Caso o formato seja inválido
                System.out.println("Formato inválido");
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

