package Ficha_pratica_01;

import java.util.Scanner;

public class ex_04 {

    public static void main(String[] args) {
        // Instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double pi, raio, area;

        System.out.print("Insira valor do raio: ");
        raio = input.nextDouble();

        pi = 3.14;

        area = (pi * (raio*raio));

        System.out.println("O valor da area do circulo é: " + area + " cm");


    }
}
