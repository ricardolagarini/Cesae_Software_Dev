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
        double menor = vetor[0];    // == o valor inserido pelo usuario, começando pelo indice [0]

        for (int indice = 0; indice < 10; indice++) {  // para valor de indice=0, se indice menor que 10, entao indice+1
            if (vetor[indice] < menor) { // Pergunta se valor do indice começando pela gaveta [0] é menor que o valor "menor" que é 5
                                         // entao 5 é = 5, entao ciclo for soma+1 no indice da gaveta, 7 é menor que 5? soma+1,
                                        // 1 é menor que 5? sim, mas nao da break, continua ate achar outro menor

              menor = vetor[indice]; // so depois de encontrar o menor valor, entao armazena
            }
        }

        System.out.print("\nMenor numero:" + menor);
    }
}