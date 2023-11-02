package Ficha_pratica_extra_condicionais;

import java.util.Scanner;

public class ex_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int idade;

        System.out.print("Qual sua idade?: ");
        idade= input.nextInt();

        if (idade>=18){
            System.out.print("\nMaior de idade ");
        }

        if (idade<=18){
            System.out.print("\nMenor de idade ");
        }

    }
}

