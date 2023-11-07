package Ficha_pratica_05;

import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declarar variaveis
        int[] vetor = new int[5];
        int soma=0, media;

        //ler elemento do array []
        for (int indice = 0; indice < vetor.length; indice++) {
            System.out.print("Insira um numero [" + indice + "]:");
            vetor[indice] = input.nextInt();
        }

        for (int indice = 0; indice < vetor.length; indice++) {  // vetor.length ajusta a qtd de indices no começo
            soma= soma + vetor[indice];
        }

        media= soma/vetor.length;
        System.out.print("\nA media é: " + media);
    }
}