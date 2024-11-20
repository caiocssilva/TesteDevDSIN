package src.main;

import java.util.Scanner;

public class SolucaoEquacao {
    public static void main(String[] args) {
        // Criação do Scanner para entrada dos valores
        Scanner scanner = new Scanner(System.in);

        try {
            // Entrada dos valores A, B e C
            System.out.print("Digite o valor de A: ");
            int A = scanner.nextInt();
            
            System.out.print("Digite o valor de B: ");
            int B = scanner.nextInt();
            
            System.out.print("Digite o valor de C: ");
            int C = scanner.nextInt();

            // Verifica se a solução é impossível (A = 0 e B = 0 e C != 1)
            if (A == 0 && B == 0 && C != 1) {
                System.out.println("Solução impossível");
            } else {
                // Calcula o valor de X, usando a fórmula derivada
                double X = (1 - C) / (double)(A + B);
                System.out.println("O valor de X é: " + X);
            }
        } catch (Exception e) {
            System.out.println("Erro na entrada dos dados: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

