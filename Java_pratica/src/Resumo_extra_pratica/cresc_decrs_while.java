package Resumo_extra_pratica;

import java.util.Scanner;

public class cresc_decrs_while {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int qtdnumero, numAnt, numAtual, numero, contador=1;
        boolean crescente=true;

        System.out.print("Quantos numeros deseja inserir?: ");
        qtdnumero = input.nextInt();

        // Ler numAnt
        System.out.print("Insira um numero: ");
        numAnt = input.nextInt();

        while (contador < qtdnumero) {

            System.out.print("Introduza um numero: ");
            numAtual = input.nextInt();

            if (numAnt >= numAtual){
                crescente=false;
            }

            numAnt=numAtual;
            contador++;
        }

        if(crescente){
            System.out.println("\nCrescente");
        }else{
            System.out.println("\nNão crescente");
        }

    }
}