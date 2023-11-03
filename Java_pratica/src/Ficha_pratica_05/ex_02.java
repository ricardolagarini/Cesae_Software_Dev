package Ficha_pratica_05;

import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int resultado;
        int[] vetor = new int[12];

        for(int mes=0; mes<=11; mes++){
            System.out.print("Insira a comissao do mês["+mes+"]:");
            vetor[mes]= input.nextInt();
            //resultado= vetor[mes]+resultado;
        }

       // System.out.print("\nValor total das comissôes é de :" + resultado );

    }
}


