package Ficha_pratica_05;

import java.util.Scanner;

public class ex_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int somatorio=0;

        // ler matriz
        for (int linha = 0; linha<matriz.length; linha++) {
            for (int coluna = 0; coluna<matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // somar todos elementos da matriz
        for (int linha = 0; linha<matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                somatorio = somatorio + matriz[linha][coluna];
            }
        }
        // Apresentar somatório
        System.out.println("Somatório: "+somatorio);
    }
}
