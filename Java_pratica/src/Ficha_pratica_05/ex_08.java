package Ficha_pratica_05;

import java.util.Scanner;

public class ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        // ler matriz
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // imprimir matriz
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna]+ "\t");
            }
            System.out.println();
        }
    }
}