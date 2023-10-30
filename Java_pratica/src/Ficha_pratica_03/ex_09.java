package Ficha_pratica_03;

import java.util.Scanner;

public class ex_09 {

    public static void main(String[] args) {

        //Faça um programa que leia um número inteiro e imprima os números pares entre 2 e o número lido inclusive.
        //Suponha que o número lido da entrada será maior que 2.

        Scanner input = new Scanner(System.in);
        int numero, contador;

        contador = 0;

        System.out.print("Insira um numero: ");
        numero = input.nextInt();

        while (contador <= numero) {
            System.out.println(contador);
            contador = contador+2;
        }
    }
}
