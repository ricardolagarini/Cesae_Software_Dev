package Ficha_pratica_extra_condicionais;

import java.util.Scanner;

public class ex_06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o ano: ");
        int ano = input.nextInt();

        //O ano deve ser divisível por 4.
        //O ano não deve ser divisível por 100, a menos que também seja divisível por 400.

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("\nÉ bissexto");
        } else {
            System.out.println("\nNão é bissexto");
        }
    }
}

