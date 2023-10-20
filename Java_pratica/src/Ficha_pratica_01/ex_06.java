package Ficha_pratica_01;

import java.util.Scanner;

public class ex_06 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //
        int varA, varB;

        System.out.print("Insira valor da variável A: ");
        varA = input.nextInt();

        System.out.print("Insira valor da variável B: ");
        varB = input.nextInt();


        System.out.println("\nVariável A: " + varA);
        System.out.println("Variável B: " + varB);

        //Trocar as variaveis

        varA=varA+varB;
        varB=varA-varB;
        varA=varA-varB;

        System.out.println("\nTrocando as variaveis... ");

        System.out.println("\nVariável A: " + varA);
        System.out.println("Variável B: " + varB);

    }
}
