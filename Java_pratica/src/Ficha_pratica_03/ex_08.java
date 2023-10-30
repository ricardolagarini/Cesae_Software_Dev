package Ficha_pratica_03;

import java.util.Scanner;

public class ex_08 {

    public static void main(String[] args) {

        //Faça um programa que vai pedindo números ao utilizador até que este introduza o número -1. O computador
        //deve dizer a média dos números introduzidosv (excluindo o -1).

        Scanner input = new Scanner(System.in);
        int numero, contador=0, soma=0, media;

        System.out.print("Insira um numero (-1 para parar): ");
        numero = input.nextInt();

        while (numero != -1) {
            contador = contador+1;
            soma = numero + soma;
            System.out.print("Insira um numero (-1 para parar: ");
            numero = input.nextInt();
        }

        System.out.println("\nSua media é:" + soma/contador );
        System.out.println("Sua soma é:" + soma );
        System.out.println("Seu contador é:" + contador );
    }

    }
