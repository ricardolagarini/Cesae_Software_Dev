package Ficha_pratica_01;

import java.util.Scanner;

public class ex_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //
        double leite, pao, fiambre,valorapg;

        System.out.print("Insira valor do Leite: ");
        leite = input.nextDouble();

        System.out.print("Insira valor do Pão: ");
        pao = input.nextDouble();

        System.out.print("Insira valor do Fiambre: ");
        fiambre = input.nextDouble();

        valorapg = ((leite+pao+fiambre)-((leite+pao+fiambre)*0.1));

        System.out.println("\nO valor total a pagar é de: " + valorapg + " €");

    }
}
