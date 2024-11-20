package src.main;

import java.util.Scanner;

public class SequenciaNumeros {

    // Função para verificar se o número é perfeito
    public static boolean isNumeroPerfeito(int n) {
        int somaDivisores = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                somaDivisores += i;
            }
        }
        return somaDivisores == n;
    }

    // Função para verificar se o número é primo
    public static boolean isNumeroPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o número N
        System.out.print("Digite o número N: ");
        int N = scanner.nextInt();

        // Itera sobre a sequência de 1 até N
        for (int i = 1; i <= N; i++) {
            // Verifica se é número perfeito
            if (isNumeroPerfeito(i)) {
                System.out.println(i + " numero perfeito");
            } 
            // Verifica se é múltiplo de 2
            else if (i % 2 == 0) {
                System.out.println(i + " multiplo de 2");
            } 
            // Verifica se é múltiplo de 7
            else if (i % 7 == 0) {
                System.out.println(i + " multiplo de 7");
            } 
            // Verifica se é número primo
            else if (isNumeroPrimo(i)) {
                System.out.println(i + " numero primo");
            }
        }

        scanner.close();
    }
}
