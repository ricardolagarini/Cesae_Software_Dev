package Ficha_pratica_05;

import java.util.Scanner;

public class ex_07_v2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declarar variaveis
        int[] vetor = new int[10];
        int maiorpar=-1;

        //ler elemento do array []
        for (int indice = 0; indice < vetor.length; indice++) {
            System.out.print("Insira um numero [" + indice + "]:");
            vetor[indice] = input.nextInt();
        }

        for (int indice = 0; indice < vetor.length; indice++) {
            if ((vetor[indice] > maiorpar || maiorpar==-1) && vetor[indice]%2==0) {
                maiorpar = vetor[indice];
            }
        }

        if(maiorpar%2==0){
            System.out.println("maior par" + maiorpar);
        } else{
            System.out.println("Não há pares no vetor");
        }

    }
}
