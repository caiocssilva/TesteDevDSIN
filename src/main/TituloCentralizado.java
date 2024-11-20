package src.main;

import java.util.Scanner;

public class TituloCentralizado {

    // Função para centralizar o texto dentro de uma largura específica
    public static String centralizarTexto(String texto, int largura) {
        int espacos = (largura - texto.length()) / 2; // Calcula a quantidade de espaços à esquerda
        StringBuilder sb = new StringBuilder();
        
        // Adiciona os espaços à esquerda
        for (int i = 0; i < espacos; i++) {
            sb.append(" ");
        }
        
        // Adiciona o texto
        sb.append(texto);
        
        // Adiciona os espaços à direita
        while (sb.length() < largura) {
            sb.append(" ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        
        // Recebe o título superior e inferior
        System.out.print("Digite o título superior: ");
        String tituloSuperior = scanner.nextLine();
        
        System.out.print("Digite o título inferior: ");
        String tituloInferior = scanner.nextLine();
        
        // Definindo a largura máxima da linha (exemplo 40 caracteres)
        int largura = 40;
        
        // Imprime o título centralizado
        System.out.println(centralizarTexto(tituloSuperior, largura));
        System.out.println(centralizarTexto(tituloInferior, largura));

        scanner.close();
    }
}
