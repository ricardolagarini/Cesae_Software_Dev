package Ficha_pratica_05;

import java.util.Scanner;

public class ex_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declarar variaveis
        double[] vetor = new double[10];

        //ler elemento do array []
        for (int indice = 0; indice < 10; indice++) {
            System.out.print("Insira um numero [" + indice + "]:");
            vetor[indice] = input.nextDouble();
        }

        //declarar menor numero
        double menor = vetor[0];

        for (int indice = 0; indice < 10; indice++) {
            if (vetor[indice] < menor) {

              menor = vetor[indice]; // so depois de encontrar o menor valor, entao armazena
            }
        }

        System.out.print("\nMenor numero:" + menor);
    }
}