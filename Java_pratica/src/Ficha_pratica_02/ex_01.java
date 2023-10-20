package Ficha_pratica_02;

import java.util.Scanner;

public class ex_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Insira um número: ");
        num1= input.nextInt();

        // Ler num2
        System.out.print("Insira um número: ");
        num2 = input.nextInt();

        if (num1>num2){
            System.out.print("Maior: " + num1);
        }

        if (num1<num2){
            System.out.print("Maior: " + num2);
        }

        if (num1==num2){
            System.out.print("São iguais");
        }

    }
}
