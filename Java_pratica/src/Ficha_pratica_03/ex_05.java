package Ficha_pratica_03;

import java.util.Scanner;

public class ex_05 {

    //Faça um programa que leia dois números inteiros, representando os valores início e fim de um intervalo e
    //imprima os números inteiros neste intervalo.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int fim, inicio;

        System.out.print("Insira um numero de inicio: ");
        inicio = input.nextInt();

        System.out.print("Insira um numero de fim: ");
        fim = input.nextInt();

        while (inicio <= fim) {
            System.out.println(inicio);
            inicio = inicio +1;
        }

    }
}
