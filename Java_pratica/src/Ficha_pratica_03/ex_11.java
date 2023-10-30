package Ficha_pratica_03;

import java.util.Scanner;

public class ex_11 {

    public static void main(String[] args) {

        //Escreva um algoritmo que leia uma quantidade desconhecida de números inteiros positivos fornecidos pelo
        //utilizador e conte quantos deles estão nos seguintes intervalos: [0.25], [26,50], [51,75] e [76,100]. A entrada de
        //dados deve terminar quando for lido um número negativo.

        Scanner input = new Scanner(System.in);
        int numero=1,intervalo1=0, intervalo2=0, intervalo3=0, intervalo4=0;

        while (numero >= 0 ) {

            System.out.print("Insira um numero de 1 a 100: ");
            numero = input.nextInt();

            if (numero >=0 && numero<=25) {
                intervalo1 = intervalo1 + 1; //mesma coisa de intervalo++
            }
            if (numero >=26 && numero<=50) {
                intervalo2 = intervalo2 + 1;
            }
            if (numero >=51 && numero<=75) {
                intervalo3 = intervalo3 + 1;
            }
            if (numero >=76 && numero<=100) {
                intervalo4 = intervalo4 + 1;
            }

        }

        System.out.print("\n[0,25]: " + intervalo1);
        System.out.print("\n[26,50]: " + intervalo2);
        System.out.print("\n[51,75]: " + intervalo3);
        System.out.print("\n[76,100]: " + intervalo4);
    }
}


