package Ficha_pratica_03;

import java.util.Scanner;

public class ex_12 {

    public static void main(String[] args) {

        //Faça um algoritmo que leia dois números inteiros, representando os valores início e fim de um intervalo e
        //imprima os múltiplos de 5 entre eles

        Scanner input = new Scanner(System.in);
        int fim, inic;

        System.out.print("Insira inicio: ");
        inic = input.nextInt();

        System.out.print("Insira fim: ");
        fim = input.nextInt();

        while (inic <= fim) {
            if (inic % 5 == 0) {  // o numero a seguir dividindo por 5 da zero?
            System.out.println(inic);}

        inic++;

        }

    }

}




