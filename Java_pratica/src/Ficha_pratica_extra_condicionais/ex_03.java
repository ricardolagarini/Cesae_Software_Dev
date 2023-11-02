package Ficha_pratica_extra_condicionais;

import java.util.Scanner;

public class ex_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor;

        System.out.print("Introduza o valor do preço: ");
        valor= input.nextInt();

        if (valor>100){
            System.out.print("\nPreço final: " + valor*0.90 + " (10% de desconto)");
        }

        if (valor<=100){
            System.out.print("\nPreço final sem desconto " + valor);
        }

    }
}
