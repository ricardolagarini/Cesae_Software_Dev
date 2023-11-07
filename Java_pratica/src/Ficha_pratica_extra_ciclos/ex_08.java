package Ficha_pratica_extra_ciclos;

import java.util.Scanner;

public class ex_08 {
    public static <Scanner> void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Declarar variáveis
        double base, expoente, resultado=1;

        // Ler base
        System.out.print("Primeiro Número: ");
        base = input.nextDouble();

        // Ler expoente
        System.out.print("Segundo Número: ");
        expoente = input.nextDouble();

        // Calcular a potência
        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }

        System.out.println("Resultado (" + base + " elevado a " + expoente + "): " + resultado);
    }
}
