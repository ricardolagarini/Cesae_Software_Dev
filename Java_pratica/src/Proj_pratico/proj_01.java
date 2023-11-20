package Proj_pratico;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Proj_pratico.Biblioteca_proj.*;

public class proj_01 {
    public static void main(String[] args) throws FileNotFoundException {

        String[][] matrizTotal = lerFicheiroParaMatriz("Ficheiros/GameStart_V2.csv");

        //instanciar variaveis
        Scanner input = new Scanner(System.in);
        int opcaoCliente=0, opcaoAdmin=0 ;
        String opcaoUsuario, password;

        // Usuario deve escolher utilizador ADMIN ou CLIENTE
        do {
            System.out.print("Tipo de utilizador (ADMIN ou CLIENTE): ");
            opcaoUsuario = input.nextLine();

                // Se escolher ADMIN, deve informar a password correta
            if (opcaoUsuario.equals("ADMIN")) {
                System.out.print("Digite a password: ");
                password = input.nextLine();

                // Se a senha se confirmar, entramos no menu ADMIN
                if (password.equals("123")) {

                    // Se usuario digitar utilizador ADMIN, e passa pela verificaçao de senha, abre se o menu ADMIN
                    do {
                    System.out.println("\n\n****** MENU ADMIN ******");
                    System.out.println("1. Imprima o seu conteúdo na consola");
                    System.out.println("2. Imprima quantas vendas foram executadas e o seu valor total");
                    System.out.println("3. Sabendo que a GameStart tem 20% de lucro em cada jogo, calcule o total de lucro");
                    System.out.println("4. Dado um idCliente, imprima todas as informações associadas a esse cliente (nome, contacto, email)");
                    System.out.println("5. Imprima qual o jogo mais caro e os clientes que o compraram");
                    System.out.println("0. Sair");
                    System.out.print("Insira a opção desejada: ");
                    opcaoAdmin = input.nextInt();

                        switch (opcaoAdmin) {
                            case 1: // Imprima o seu conteúdo na consola
                                System.out.println("\n****** IMPRIMIR CONTEUDO ******");
                                imprimirFicheiro("Ficheiros/GameStart_V2.csv");
                                break;
                            case 2: // Imprima quantas vendas foram executadas e o seu valor total
                                System.out.println("\n****** VALOR TOTAL DE VENDAS******");
                                regVendasTot(matrizTotal);
                                break;
                            case 3: // Sabendo que a GameStart tem 20% de lucro em cada jogo, calcule o total de lucro.
                                System.out.println("\n****** VALOR TOTAL DE VENDAS + 20% LUCRO ******");
                                VendasTotLucro(matrizTotal);
                                break;
                            case 4: // Dado um idCliente, imprima todas as informações associadas a esse cliente (nome, contacto, email).
                                System.out.println("\n****** DADOS CLIENTE******");
                                idClientesFicheiro(matrizTotal);
                                break;
                            case 5: // Imprima qual o jogo mais caro e os clientes que o compraram
                                System.out.println("\n****** JOGO MAIS CARO VENDIDO ******");
                                jogoMaisCaro(matrizTotal);
                                break;
                            case 0:
                                System.out.println("\n<><><> Até logo <><><>");
                                break;
                            default:
                                System.out.println("\nOpção inválida!");
                        }

                        // Menu encerra-se quando o usuario digitar 0
                    } while (opcaoAdmin != 0);

                    // caso a senha seja incorreta, o programa se encerra
                } else {
                    System.out.println("Senha invalida!");
                }

                // Se usuario digitar utilizador CLIENTE, abre se o menu CLIENTE
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
                        case 1: // Registar cliente
                            System.out.println("\n****** REGISTO DE CLIENTE ******");
                            registoCliente(input);
                            break;
                        case 2: // Procurar estacionamento vago
                            System.out.println("\n****** ESTACIONAMENTO ******");
                            listarVagas(matrizTotal);
                            break;
                        case 3: // Listar jogos do ficheiro
                            System.out.println("\n****** LISTA DE JOGOS ******");
                            listarJogosFicheiro(matrizTotal);
                            break;
                        case 4: // listar jogos por categoria do ficheiro e imprmir esteticamente
                            System.out.println("\n****** JOGOS POR CATEGORIA ******");
                            jogosPorcategoria(matrizTotal);
                            break;
                        case 0:
                            System.out.println("\n<><><> Até logo <><><>");
                            break;
                        default:
                            System.out.println("\nOpção inválida!");
                    }

                    // MMenu encerra-se quando o usuario digitar 0
                } while (opcaoCliente != 0);
                break;

                // Se usuario digitar utiliador invalido, o programa se encerra
            } else {
                System.out.println("Tipo de usuario inválido!");
                break;
            }

        } while (!opcaoUsuario.equals("ADMIN") && !opcaoUsuario.equals("CLIENTE"));
    }
}