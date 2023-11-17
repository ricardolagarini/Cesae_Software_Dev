package Proj_pratico;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Proj_pratico.Biblioteca_proj.*;

public class proj_01 {
    public static void main(String[] args) throws FileNotFoundException {

        String[][] matrizTotal = lerFicheiroParaMatriz("Ficheiros/GameStart_V2.csv");

        Scanner input = new Scanner(System.in);
        int opcaoCliente=0 ;
        String opcaoUsuario, password;

        do {
            System.out.print("Tipo de utilizador (ADMIN ou CLIENTE): ");
            opcaoUsuario = input.nextLine();

            if (opcaoUsuario.equals("ADMIN")) {
                System.out.print("Digite a password: ");
                password = input.nextLine();

                if (password.equals("123")) {
                    System.out.println("\n\n****** MENU ADMIN ******");
                    System.out.println("1. Imprima o seu conteúdo na consola");
                    System.out.println("2. Imprima quantas vendas foram executadas e o seu valor total");
                    System.out.println("3. Sabendo que a GameStart tem 20% de lucro em cada jogo, calcule o total de lucro");
                    System.out.println("4. Dado um idCliente, imprima todas as informações associadas a esse cliente (nome, contacto, email)");
                    System.out.println("5. Imprima qual o jogo mais caro e os clientes que o compraram");
                    System.out.println("0. Sair");
                    System.out.print("Insira a opção desejada: ");
                    int opcaoAdmin = input.nextInt();
                } else {
                    System.out.println("Senha invalida!");
                }


            } else if (opcaoUsuario.equals("CLIENTE")) {

                do {
                    System.out.println("\n\n****** MENU CLIENTE ******");
                    System.out.println("1. Registo de cliente");
                    System.out.println("2. Procurar estacionamento");
                    System.out.println("3. Listar jogos");
                    System.out.println("4. Listar jogos por Editora");
                    System.out.println("0. Sair");
                    System.out.print("Insira a opção desejada: ");
                    opcaoCliente = input.nextInt();

                    switch (opcaoCliente) {
                        case 1:
                            System.out.println("\n****** REGISTO DE CLIENTE ******");
                            registoCliente(input);
                            break;

                        case 2:
                            System.out.println("\n****** ESTACIONAMENTO ******");
                            listarVagas(matrizTotal);
                            break;

                        case 3:
                            System.out.println("\n****** LISTA DE JOGOS ******");
                            listarJogosFicheiro(matrizTotal);
                            break;

                        case 4:
                            System.out.println("\n****** JOGOS POR CATEGORIA ******");
                            System.out.print("Editora a pesquisar: ");
                            input.nextLine();
                            String editora = input.nextLine();
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

                } while (opcaoCliente != 0);

                break;
            } else {
                System.out.println("Tipo de usuario inválido!");
                break;
            }

        } while (!opcaoUsuario.equals("ADMIN") && !opcaoUsuario.equals("CLIENTE"));
    }
}