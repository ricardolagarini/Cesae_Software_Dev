package Ficha_pratica_extra_condicionais;

import java.util.Scanner;

public class ex_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Advinhe o numero  (0 a 100): ");
        numero= input.nextInt();


        if (numero>31){
            System.out.print("\nMuito Alto!");
        }else {
            System.out.print("\nMuito Baixo!");
        }

        if (numero==31){
            System.out.print("\nAcertou o Numero!!!... ");
        }

    }
}

