package Ficha_pratica_03;

import java.util.Scanner;

public class ex_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero, inicio;

        inicio = 0;

        System.out.print("Insira um numero: ");
        numero = input.nextInt();

        while (inicio <= numero) {
            System.out.println(inicio);
            inicio = inicio +1;
        }

    }
}
