package Ficha_pratica_05;

import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor1 = new int[3];
        int[] vetor2 = new int[3];
        int[][] matriz = new int[3][2];

        // Ler vetor1
        for (int indice = 0; indice < vetor1.length; indice++) {
            System.out.print("Insira um número no Vetor1[" + indice + "]: ");
            vetor1[indice] = input.nextInt();
        }

        // Ler vetor2
        for (int indice = 0; indice < vetor2.length; indice++) {
            System.out.print("Insira um número no Vetor2[" + indice + "]: ");
            vetor2[indice] = input.nextInt();
        }

        // Iterar as linhas da matriz
        for (int indice = 0; indice < matriz.length; indice++) {
            matriz[indice][0]=vetor1[indice];
            matriz[indice][1]=vetor2[indice];
        }

    }
}
