package FIcha_pratica_extra_arrays_matrizes;

import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Criando um array para armazenar os números
        int[] numeros = new int[4];

        // Solicitando a inserção dos números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
