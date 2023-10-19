package Ficha_pratica_01;

import java.util.Scanner;

public class ex_02 {

    public static void main(String[] args) {
        // Instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2, multiplicar, subtrair, dividir, soma;

        // Ler num1
        System.out.print("Insira um número: ");
        num1= input.nextInt();

        // Ler num2
        System.out.print("Insira um número: ");
        num2 = input.nextInt();

        // Calcular a soma de num1+num2
        soma = num1+num2;

        // Multiplicar num1*num2
        multiplicar = num1*num2;

        // Subtrair num1-num2
        subtrair = num1-num2;

        // dividir num1/num2
        dividir = num1/num2;

        // Apresentar a soma
        System.out.println("Soma: " + soma);

        // Apresentar a multiplicar
        System.out.println("Multiplicação: " + multiplicar);

        // Apresentar a subtrair
        System.out.println("Subtração: " + subtrair);

        // Apresentar a dividir
        System.out.println("Divisão: " + dividir);
    }
}
