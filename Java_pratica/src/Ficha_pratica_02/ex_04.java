package Ficha_pratica_02;

import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int lugar;

        System.out.print("\nInsira o lugar que chegou: ");
        lugar= input.nextInt();

        if (lugar==1){
            System.out.print("\nGanhou 10 pontos!");
        }

        if (lugar==2){
            System.out.print("\nGanhou 8 pontos!");
        }

        if (lugar==3){
            System.out.print("\nGanhou 6 pontos!");
        }

        if (lugar==4){
            System.out.print("\nGanhou 5 pontos!");
        }

        if (lugar==5){
            System.out.print("\nGanhou 4 pontos!");
        }

        if (lugar==6){
            System.out.print("\nGanhou 3 pontos!");
        }

        if (lugar==7){
            System.out.print("\nGanhou 2 pontos!");
        }

        if (lugar==8){
            System.out.print("\nGanhou 1 ponto!");
        }

        if (lugar>=9){
            System.out.print("\nNão ganhou pontos!");
        }

    }
}
