package Ficha_pratica_05;

import java.util.Scanner;

public class ex_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declarar variaveis
        double[] vetor = new double[10];

        //ler elemento do array []
        for (int indice = 0; indice < 10; indice++) {
            System.out.print("Insira um numero [" + indice + "]:");
            vetor[indice] = input.nextDouble();
        }

        double maior = vetor[0];

        //declarar maior numero
        for (int indice = 0; indice < 10; indice++) {
            if (vetor[indice] > maior) {
                maior = vetor[indice];
            }
        }

        System.out.print("\nMaior numero:" + maior);
    }
}
