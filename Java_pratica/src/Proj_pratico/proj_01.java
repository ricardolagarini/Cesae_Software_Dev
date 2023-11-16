package Proj_pratico;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Proj_pratico.Biblioteca_proj.*;

public class proj_01 {
    public static void main(String[] args) throws FileNotFoundException {

        String[][] matrizTotal = lerFicheiroParaMatriz("Ficheiros/GameStart_V2.csv");

        Scanner input = new Scanner(System.in);
        int opcaoUsuario,opcaoCliente=0 ;
        String nomeUsuario,emailUsuario,contactoUsuario,nomeJogo;

        do {
            System.out.print("(ADMIN ou CLIENTE): ");
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
                    System.out.println("0. Sair");
                    System.out.print("Insira a opção desejada: ");
                    int opcaoAdmin = input.nextInt();
                    break;

                case 2:
                    do{
                    System.out.println("\n\n****** MENU CLIENTE ******");
                    System.out.println("1. Registo de cliente");
                    System.out.println("2. Procurar estacionamento");
                    System.out.println("3. Listar jogos");
                    System.out.println("4. Listar jogos por Editora");
                    System.out.println("0. Sair");
                    System.out.print("Insira a opção desejada: ");
                    opcaoCliente = input.nextInt();

                    switch (opcaoCliente) {
                        case 1: // Fazer registo do cliente
                            System.out.println("\n****** REGISTO DE CLIENTE ******");
                            System.out.print("Insira seu nome: ");
                            input.nextLine(); // limpar campo
                            nomeUsuario = input.nextLine();
                            System.out.print("Insira seu contacto: ");
                            contactoUsuario = input.nextLine();
                            System.out.print("Insira seu email: ");
                            emailUsuario = input.nextLine();
                            System.out.println("\nCliente Inserido com Sucesso!");
                            System.out.println(nomeUsuario + " | " + contactoUsuario + " | " + emailUsuario + "\n");

                            // Retornar para o menu do cliente
                            opcaoCliente = -1;
                            break;


                        case 2: // Procurar vagas de estacionamento diposniveis
                            System.out.println("\n****** ESTACIONAMENTO ******");
                            listarVagas(matrizTotal);
                            break;

                        case 3: // Listar jogos do ficheiro
                            System.out.println("\n****** LISTA DE JOGOS ******");
                            listarJogosFicheiro(matrizTotal);
                            break;

                        case 4: // Listar jogos pesquisando pela editora no ficheiro separados por categoria
                            System.out.println("\n****** JOGOS POR CATEGORIA ******");

                            System.out.print("Editora a pesquisar: ");
                            input.nextLine();
                            String editora= input.nextLine();
                            for (int linha = 0; linha < matrizTotal.length; linha++) {

                                if (matrizTotal[linha][5].equals(editora)) {
                                    System.out.println("Jogo: " + matrizTotal[linha][7] + "\t" + "Categoria: " + matrizTotal[linha][6]);
                                }
                            }
                            break;

                        case 0:
                            System.out.println("\n<><><> Até logo <><><>");
                            break;

                        default:
                            System.out.println("\nOpção inválida!");
                    }

                }while (opcaoCliente!=0);

                    break;

                default:
                    System.out.println("\nTipo de utilizador inválido!");
                    System.out.println("Selecione 1 para ADMIN ou 2 para CLIENTE\n");
            }


        }while (opcaoUsuario<1||opcaoUsuario>2);
    }
}