package Ficha_pratica_06;

import java.util.Scanner;

import static Ficha_pratica_06.ex_03.*;

public class ex_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, opcao;

        System.out.print("Insira um número:");
        numero= input.nextInt();

        do{
            System.out.println("1. Par ou Impar");
            System.out.println("2. Positivo ou Negativo");
            System.out.println("3. Primo ou Não Primo");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("6. Trocar de Número");
            System.out.println("7. Sair");

            System.out.print("\nInsira a opção: ");
            opcao= input.nextInt();

            switch (opcao){
                case 1: // Par ou Impar
                    if(par(numero)){
                        System.out.println("\n***Par***\n");
                    }else{
                        System.out.println("\n***Impar***\n");
                    }
                    break;

                case 2: // Positivo ou Negativo
                    if(positivo(numero)){
                        System.out.println("\n***Positivo***\n");
                    }else{
                        System.out.println("\n***Negativo***\n");
                    }
                    break;

                case 3: // Primo ou não Primo
                    if(primo(numero)){
                        System.out.println("\n***Primo***\n");
                    }else{
                        System.out.println("\n***Não Primo***\n");
                    }
                    break;

                case 4: // Par && Positivo && Primo
                    if(par(numero) && positivo(numero) && primo(numero)){
                        System.out.println("\n***Par, Positivo e Primo ao mesmo tempo***\n");
                    }
                    break;

                case 5: break;

                case 6: // Trocar de Número
                    break;

                case 7: // Sair

                default:
                    System.out.println("Opção Inválida!!!");
            }

        }while(opcao!=7);

    }
}
