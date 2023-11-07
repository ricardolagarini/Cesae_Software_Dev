package Ficha_pratica_05;

import java.util.Scanner;

public class ex_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        int contagem = 0;

        // ler matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // Pede ao usuário para fornecer o valor a ser contado na matriz
        System.out.print("\nDigite o valor que deseja contar na matriz: ");
        int valorProcurado = input.nextInt();

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                if (matriz[linha][coluna] == valorProcurado) {
                    contagem++;
                }
            }
        }

        // Exibe o resultado
        System.out.println("O valor " + valorProcurado + " aparece na matriz " + contagem + " vezes.");
    }
}