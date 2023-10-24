package Ficha_pratica_02;

import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Insira um número: ");
        num1= input.nextInt();

        // Ler num2
        System.out.print("Insira um número: ");
        num2 = input.nextInt();

        if (num1==num2){
            System.out.print("São iguais");
        }

        if (num1>num2){
            System.out.print("Maior numero é o " + num1 +"" + " e o menor é o " + num2);
        }else {System.out.print("Maior numero é o " + num2 +"" + " e o menor é o " + num1);}


    }
}
