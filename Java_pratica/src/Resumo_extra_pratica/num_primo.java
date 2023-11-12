package Resumo_extra_pratica;

import java.util.Scanner;

public class num_primo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;
        boolean primo = true;

        System.out.print("Insira um número: ");
        numero= input.nextInt();

        for(int divisor=2; divisor<numero;divisor++){

            // System.out.println("Vou tentar dividir "+numero+"%"+divisor);
            // Vou avaliar se há algum divisor de número que não 1 ou ele mesmo
            if(numero%divisor==0){
                // Número deixa de ser primo
                // System.out.println("Número deixou de ser primo");
                primo=false;
            }

        }

        if(primo){
            System.out.println("Primo");
        }else{
            System.out.println("Não Primo");
        }

    }
}