package Ficha_pratica_03;

import java.util.Scanner;

public class ex_07 {

    //Faça um programa que leia um número inteiro e imprima os 5 anteriores e os 5 seguintes
    //Por exemplo: Leu 15, deve imprimir: 10 11 12 13 14 16 17 18 19 20

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero, diminui=-5, aumenta=+5;

        System.out.print("Insira um numero: ");
        numero = input.nextInt();

        while (diminui < numero) {
            System.out.println(diminui);
            diminui = diminui+1;
        }

        numero = numero+1;

        while (aumenta >= numero) {
            System.out.println(numero);
            numero = numero+1;
        }

    }
}