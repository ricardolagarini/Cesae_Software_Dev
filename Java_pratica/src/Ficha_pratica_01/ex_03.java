package Ficha_pratica_01;

import java.util.Scanner;

public class ex_03 {

    public static void main(String[] args) {
        // Instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int base, altura, perimetro, area;

        // Ler num1
        System.out.print("Insira valor da base: ");
        base = input.nextInt();

        // Ler num2
        System.out.print("Insira o valor da altura: ");
        altura = input.nextInt();

        // Perimetro
        perimetro = 2 * (base + altura);

        // Area
        area = (base * altura);

        // Apresentar o perimetro
        System.out.println("O valor do perimetro do retangulo é: " + perimetro);

        // Apresentar a area
        System.out.println("O valor da area do retangulo é: " + area);

    }
}
