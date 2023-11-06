package Ficha_pratica_05;

import java.util.Scanner;

public class ex_02_v2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declarar variaveis
        double[] comissoes = new double[12];
        double totalAnual= 0;

        //adicionar comissoes a cada elemento do array []
        for(int indice=0; indice<=11; indice++){
            System.out.print("Insira a comissao do mês["+indice+"]:");
            comissoes[indice]= input.nextDouble();
        }

        //calcular o total anual
        for(int indice=0; indice<=11; indice++){
            totalAnual=totalAnual+comissoes[indice];
        }

        //apresentar o total anual
        System.out.print("\nValor total das comissôes é de :" + totalAnual );
    }
}


