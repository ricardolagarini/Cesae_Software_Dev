package Ficha_pratica_05;

import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        for(int indice=0; indice<10; indice++){
            System.out.print("Insira um número no Vetor["+indice+"]:");
            vetor[indice]= input.nextInt();
        }

        for(int indice=0; indice<10; indice++){
            System.out.println("Vetor["+indice+"]:" + vetor[indice]);
        }
    }
}
