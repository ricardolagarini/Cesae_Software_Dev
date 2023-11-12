package FIcha_pratica_extra_arrays_matrizes;

import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um array de tamanho 10
        int[] array = new int[10];

        // Preenchendo o array
        System.out.println("Digite 10 números para preencher o array:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Exibindo o array
        System.out.println("Array preenchido:");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }

        // Pesquisando um valor no array
        System.out.print("\nDigite o valor a ser pesquisado: ");
        int valorPesquisado = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < 10; i++) {
            if (array[i] == valorPesquisado) {
                encontrado = true;
                break;
            }
        }

        // Exibindo o resultado da pesquisa
        if (encontrado) {
            System.out.println("O valor " + valorPesquisado + " está presente no array.");
        } else {
            System.out.println("O valor " + valorPesquisado + " não está presente no array.");
        }

        // Fechando o scanner
        scanner.close();
    }
}