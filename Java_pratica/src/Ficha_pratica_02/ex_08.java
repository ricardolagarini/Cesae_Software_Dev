package Ficha_pratica_02;

import java.util.Scanner;

public class ex_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, mediaponderada;

        System.out.print("Insira a 1º nota: ");
        nota1= input.nextDouble();

        System.out.print("Insira um 2º nota: ");
        nota2 = input.nextDouble();

        System.out.print("Insira um 3º nota: ");
        nota3 = input.nextDouble();

        mediaponderada = (nota1*0.25) + (nota1*0.35) + (nota1*0.4);

        if (mediaponderada>=9.5){System.out.print("\nResultado: Aprovado");
        }else{System.out.print("\nResultado: Reprovado");}

        {System.out.println("\nMédia ponderada " + mediaponderada);}

    }

}
