package Ficha_pratica_05;

import java.util.Scanner;

public class ex_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declarar variaveis
        int[] vetor = new int[10];

        //ler elemento do array []
        for (int indice = 0; indice < vetor.length; indice++) {
            System.out.print("Insira um numero [" + indice + "]:");
            vetor[indice] = input.nextInt();
        }

        int maiorpar = vetor[0];

        for (int indice = 0; indice < vetor.length; indice++) {
            if (vetor[indice] > maiorpar && vetor[indice]%2==0) {
                maiorpar = vetor[indice];
            }
        }

        System.out.print("\nMaior numero par:" + maiorpar);
    }
}