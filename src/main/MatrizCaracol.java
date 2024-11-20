package src.main;

import java.util.Scanner;

public class MatrizCaracol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Recebe o valor de N
        System.out.print("Digite o tamanho N da matriz: ");
        int N = scanner.nextInt();
        
        // Cria a matriz de tamanho N x N
        int[][] matriz = new int[N][N];
        
        // Variáveis para controlar a direção e o preenchimento da matriz
        int valor = 1;
        int topo = 0, baixo = N - 1, esquerda = 0, direita = N - 1;
        
        while (valor <= N * N) {
            // Preencher da esquerda para a direita
            for (int i = esquerda; i <= direita; i++) {
                matriz[topo][i] = valor++;
            }
            topo++;
            
            // Preencher de cima para baixo
            for (int i = topo; i <= baixo; i++) {
                matriz[i][direita] = valor++;
            }
            direita--;
            
            // Preencher da direita para a esquerda
            for (int i = direita; i >= esquerda; i--) {
                matriz[baixo][i] = valor++;
            }
            baixo--;
            
            // Preencher de baixo para cima
            for (int i = baixo; i >= topo; i--) {
                matriz[i][esquerda] = valor++;
            }
            esquerda++;
        }
        
        // Exibe a matriz
        System.out.println("Matriz em formato de caracol:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
