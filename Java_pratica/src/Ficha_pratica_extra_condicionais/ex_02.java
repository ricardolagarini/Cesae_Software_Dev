package Ficha_pratica_extra_condicionais;

import java.util.Scanner;

public class ex_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int peso;

        System.out.print("Insira quanto você pesa: ");
        peso= input.nextInt();

        if (peso>0){
            System.out.print("\nSeu peso na Lua seria de: " + peso*0.16 + "Kg");
        }

        if (peso<=0){
            System.out.print("\nValor invalido... ");
        }

    }
}
