package Ficha_pratica_03;

import java.util.Scanner;

public class ex_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fatorial=1, numero, numped;

        System.out.print("Introduza um numero para calcular seu fatorial: ");
        numero = input.nextInt();

        numped=numero; // Guardar numero imputado apenas para imprimir resultado

        fatorial = numero;
        numero--;

        while (numero > 0){ // Enquanto o numero guardado for maior que 1, prog continuar a reduzir -1 do multplicador
        fatorial = fatorial*(numero);
        numero--;
        }

        System.out.print("\nResultado do fatorial de " + numped+ " é: " + fatorial);

    }

}
