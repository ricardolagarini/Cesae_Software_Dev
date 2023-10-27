package Ficha_pratica_03;

import java.util.Scanner;

public class ex_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero, diminui, aumenta;

        System.out.print("Insira um numero: ");
        numero = input.nextInt();

        diminui = numero-5;
        aumenta = numero+5;

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