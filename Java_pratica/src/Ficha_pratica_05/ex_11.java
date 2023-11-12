package Ficha_pratica_05;

import java.util.Scanner;
public class ex_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int maior, menor;

        // ler matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        maior = matriz[0][0];
        menor = matriz[0][0];

        //ciclo que vai iterar a matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                if (matriz[linha][coluna] > maior) {
                    maior=matriz[linha][coluna];
                }

                if (matriz[linha][coluna] < maior) {
                    menor=matriz[linha][coluna];
                }
            }
        }

        //imprimir a matriz na consola
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMenor:"+menor);
        System.out.println("Maior:"+maior);
    }
}
