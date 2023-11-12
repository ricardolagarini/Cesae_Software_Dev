package Resumo_extra_pratica;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitação do lugar em que o piloto terminou
        System.out.print("Digite o lugar em que o piloto terminou: ");
        int lugar = input.nextInt();

        // Verifica o lugar e atribui os pontos correspondentes
        int pontos = 0;

        switch (lugar) {
            case 1:
                pontos = 10;
                break;
            case 2:
                pontos = 8;
                break;
            case 3:
                pontos = 6;
                break;
            case 4:
                pontos = 5;
                break;
            case 5:
                pontos = 4;
                break;
            case 6:
                pontos = 3;
                break;
            case 7:
                pontos = 2;
                break;
            case 8:
                pontos = 1;
                break;
            default:
                System.out.println("Posição inválida. O piloto não ganhou pontos.");
        }

        // Exibição dos pontos ganhos
        if (pontos > 0) {
            System.out.println("O piloto ganhou " + pontos + " pontos.");
        }

    }
}