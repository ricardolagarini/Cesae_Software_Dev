package Ficha_pratica_05;

import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declarar variaveis
        int[] vetor = new int[10];
        boolean crescente = true;

        //ler elemento do array []
        for (int indice = 0; indice < vetor.length; indice++) {
            System.out.print("Insira um numero [" + indice + "]:");
            vetor[indice] = input.nextInt();
        }

        for (int indice = 1; indice < vetor.length; indice++) {  // vetor.length ajusta a qtd de indices no começo
           if (vetor[indice]<= vetor[indice-1]){
               crescente=false;
            }
        }

        if (crescente){
            System.out.print("\nVetor Crescente");
        }else {
            System.out.print("\nVetor não Crescente");
        }
    }
}