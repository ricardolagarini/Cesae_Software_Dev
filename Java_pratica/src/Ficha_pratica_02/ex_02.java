package Ficha_pratica_02;

import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario;

        System.out.print("Insira o salário: ");
        salario = input.nextDouble();

        if(salario <= 15000){
            System.out.println("\nPaga taxa de 20%: " + (salario*0.2) + " €");
        }else{
            System.out.println("\nPaga taxa de 30%: " + (salario*0.3) + " €");
        }

    }
}
