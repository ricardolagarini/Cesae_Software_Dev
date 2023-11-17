package Proj_pratico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Biblioteca_proj {
    /**
     * Método que retorna o número de linhas totais de um ficheiro
     *
     * @param caminhoFicheiro Caminho do Ficheiro
     * @return Número de Linhas Totais
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static int contarLinhasFicheiro(String caminhoFicheiro) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner scanner = new Scanner(ficheiro);
        int contagemLinhas = 0;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            contagemLinhas++;
        }
        return contagemLinhas;
    }

    /**
     * Método que retorna o número de colunas totais de um ficheiro
     *
     * @param caminhoFicheiro Caminho do Ficheiro
     * @return Número de Colunas Totais
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static int contarColunasFicheiro(String caminhoFicheiro, String delimitador) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner scanner = new Scanner(ficheiro);
        int contagemColunas = 0;
        String linha = scanner.nextLine();
        String[] itensLinha = linha.split(delimitador);
        contagemColunas = itensLinha.length;
        return contagemColunas;
    }

    /**
     * Método que armazena numa matriz o conteudo de um ficheiro
     *
     * @param caminhoFicheiro Caminho do Ficheiro
     * @return Matriz String[][] preenchida com o conteudo
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static String[][] lerFicheiroParaMatriz(String caminhoFicheiro) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner scanner = new Scanner(ficheiro);

        // Contar numero de linhas do ficheiro (excluindo o cabecalho)
        int numeroLinhas = (contarLinhasFicheiro(caminhoFicheiro)) - 1;

        // Contar número de colunas do ficheiro
        int numeroColunas = contarColunasFicheiro(caminhoFicheiro, ";");

        // Declarar uma matriz com o tamanho adequado
        String[][] matrizTotal = new String[numeroLinhas][numeroColunas];

        String linhaAtual = scanner.nextLine();
        int linhaMatriz = 0;

        while (scanner.hasNextLine()) {
            linhaAtual = scanner.nextLine();
            String[] itensLinha = linhaAtual.split(";");
            for (int i = 0; i < itensLinha.length; i++) {
                matrizTotal[linhaMatriz][i] = itensLinha[i];
            }
            linhaMatriz++;
        }
        return matrizTotal;
    }

    /**
     * Método para listar jogos do ficheiro
     *
     * @param matrizTotal Matriz a pesquisar
     */
    public static void listarJogosFicheiro(String[][] matrizTotal) {
        boolean confirmaJogo = true;
        for (int linha = 0; linha < matrizTotal.length; linha++) {
            for (int coluna = 0; coluna < matrizTotal.length; coluna++) {
                if (linha != coluna && matrizTotal[linha][7].equals(matrizTotal[coluna][7])) {
                    confirmaJogo = false;
                }
            }
            if (confirmaJogo) {
                System.out.println("Jogo: " + matrizTotal[linha][7]);
            } else {
                confirmaJogo = true;
            }
        }
    }

    /**
     * Método para Procurar vagas de estacionamento diposniveis
     *
     * @param matrizTotal Matriz a pesquisar
     */
    public static void listarVagas(String[][] matrizTotal) {
        int somatorio=0, contador=1, limite=121;
        while (somatorio<=limite){
            somatorio+=contador;
            contador++;
            if(somatorio % 5 == 0){
                System.out.println("Vaga " + somatorio + " está disponivel ");
            }
        }
    }


    /**
     * Registo de cliente
     *
     *
     */
    public static void registoCliente(Scanner input) {
        String nomeUsuario, emailUsuario, contactoUsuario;

        System.out.print("Insira seu nome: ");
        input.nextLine(); // limpar campo
        nomeUsuario = input.nextLine();
        System.out.print("Insira seu contacto: ");
        contactoUsuario = input.nextLine();
        System.out.print("Insira seu email: ");
        emailUsuario = input.nextLine();
        System.out.println("\nCliente Inserido com Sucesso!");
        System.out.println(nomeUsuario + " | " + contactoUsuario + " | " + emailUsuario + "\n");
    }








}

