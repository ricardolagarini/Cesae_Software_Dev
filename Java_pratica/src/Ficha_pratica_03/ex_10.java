package Ficha_pratica_03;

import java.util.Scanner;

public class ex_10 {

    public static void main(String[] args) {

        //Faça um programa que leia um número inteiro e imprima os números pares entre 2 e o número lido inclusive.
        //Suponha que o número lido da entrada será maior que 2.
        //Valores lidos: 10 (limite) e 3 (salto)
        //Saída do algoritmo: 0 3 6 9

        Scanner input = new Scanner(System.in);
        int contador=0, limite, salto;

        System.out.print("Insira um limite: ");
        limite = input.nextInt();

        System.out.print("Insira um salto: ");
        salto = input.nextInt();

        while (contador <= limite) {
            System.out.println(contador);
            contador= contador+salto;

        }
    }
}


