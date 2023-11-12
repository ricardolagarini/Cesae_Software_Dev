package Resumo_extra_pratica;

import java.util.Scanner;

public class contador_for_maior_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inicializando a variável para armazenar o maior número
        int maior = 0;

        // Solicitação de entrada dos números
        for (int cont = 0; cont < 4; cont++) {
            System.out.print("Digite o número: ");
            int numero = input.nextInt();

            // Comparando com o maior número até agora
            if (numero > maior) {
                maior = numero;   // o número inserido for maior que o valor atual de maior, a variável maior é atualizada com o valor do numero
            }                     // a variável maior sempre contenha o maior número encontrado até o momento.
        }

        // Exibindo o resultado
        System.out.println("O maior número é: " + maior);

    }
}