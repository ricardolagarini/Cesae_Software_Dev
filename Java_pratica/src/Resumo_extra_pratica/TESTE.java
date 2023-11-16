package Resumo_extra_pratica;

import java.util.Scanner;
import java.io.FileNotFoundException;

public class TESTE {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcaoUsuario, opcaoCliente = 0;
        String nomeUsuario, emailUsuario;

        do {
            System.out.println("\n\n****** GAMESTART ******");
            System.out.println("1. ADMIN");
            System.out.println("2. CLIENTE");
            System.out.print("Insira seu tipo de login: ");
            opcaoUsuario = input.nextInt();

            switch (opcaoUsuario) {
                case 1:
                    System.out.println("\n\n****** MENU ADMIN ******");
                    System.out.println("1. Imprima o seu conteúdo na consola");
                    System.out.println("2. Imprima quantas vendas foram executadas e o seu valor total");
                    System.out.println("3. Sabendo que a GameStart tem 20% de lucro em cada jogo, calcule o total de lucro");
                    System.out.println("4. Dado um idCliente, imprima todas as informações associadas a esse cliente (nome, contacto, email)");
                    System.out.println("5. Imprima qual o jogo mais caro e os clientes que o compraram");
                    System.out.print("Insira a opção desejada: ");
                    int opcaoAdmin = input.nextInt();
                    break;

                case 2:
                    do {
                        System.out.println("\n\n****** MENU CLIENTE ******");
                        System.out.println("1. Registo de cliente");
                        System.out.println("2. Procurar estacionamento");
                        System.out.println("3. Imprima todos os títulos de jogos");
                        System.out.println("4. Imprima todas as categorias e os respetivos jogos");
                        System.out.println("0. Sair");
                        System.out.print("Insira a opção desejada: ");
                        opcaoCliente = input.nextInt();

                        switch (opcaoCliente) {
                            case 1:
                                System.out.println("\n****** REGISTO DE CLIENTE ******");
                                System.out.print("Insira seu nome: ");
                                nomeUsuario = input.next();
                                System.out.print("Insira seu contacto: ");
                                int contactoUsuario = input.nextInt();
                                System.out.print("Insira seu email: ");
                                emailUsuario = input.next();
                                System.out.println("\nCliente Inserido com Sucesso!");
                                System.out.println(nomeUsuario + "|" + contactoUsuario + "|" + emailUsuario + "\n");
                                break;

                            case 2:
                                break;

                            case 3:
                                break;

                            case 4:
                                break;

                            case 5:
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("\nOpção inválida no MENU CLIENTE!");
                        }

                    } while (opcaoCliente < 1 || opcaoCliente > 5);

                    break;

                default:
                    System.out.println("\nTipo de utilizador inválido!");
                    System.out.println("Selecione 1 para ADMIN ou 2 para CLIENTE\n");
            }

        } while (opcaoUsuario < 1 || opcaoUsuario > 2);
    }
}

