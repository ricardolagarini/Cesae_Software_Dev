package Ficha_pratica_03;

import java.awt.*;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class testee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Opção selecionada: Criar");
                    break;
                case 2:
                    System.out.println("Opção selecionada: Atualizar");
                    break;
                case 3:
                    System.out.println("Opção selecionada: Eliminar");
                    break;
                case 4:
                    System.out.println("Saindo do programa. Adeus!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

        } while (opcao != 4);
    }
}
