package Ficha_pratica_01;

import java.util.Scanner;

public class ex_05 {

    public static void main(String[] args) {
        // Instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double num1, num2, num3, media, mediapond;

        System.out.print("Insira valor do numero: ");
        num1 = input.nextDouble();

        System.out.print("Insira valor do numero: ");
        num2 = input.nextDouble();

        System.out.print("Insira valor do numero: ");
        num3 = input.nextDouble();

        media = ((num1+num2+num3)/3);

        mediapond = ((num1*0.20)+(num2*0.30)+(num3*0.50));

        System.out.println("A média aritimética é: " + media);

        System.out.println("A média ponderada é: " + mediapond);
    }
}
