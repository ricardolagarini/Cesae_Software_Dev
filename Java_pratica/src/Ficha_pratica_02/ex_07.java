package Ficha_pratica_02;

import java.util.Scanner;

public class ex_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1;

        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        if(num1 % 2 == 0){
            System.out.println("\nEste número é par" );
        }else{
            System.out.println("\nEste número é ímpar" );
        }

    }
}
