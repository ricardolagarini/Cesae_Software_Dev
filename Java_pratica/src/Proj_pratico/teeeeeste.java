package Proj_pratico;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class teeeeeste {

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
        int numeroColunas = contarColunasFicheiro(caminhoFicheiro, ",");

        // Declarar uma matriz com o tamanho adequado
        String[][] matrizTotal = new String[numeroLinhas][numeroColunas];

        String linhaAtual = scanner.nextLine();
        int linhaMatriz = 0;

        while (scanner.hasNextLine()) {
            linhaAtual = scanner.nextLine();
            String[] itensLinha = linhaAtual.split(",");

            for (int i = 0; i < itensLinha.length; i++) {
                matrizTotal[linhaMatriz][i] = itensLinha[i];
            }

            linhaMatriz++;
        }
        return matrizTotal;
    }


    /**
     * Método para imprimir na consola as músicas de um determinado artista
     *
     * @param matrizTotal Matriz a pesquisar
     * @param artista     Artista a pesquisar
     */
    public static void pesquisarMusicasPorArtista(String[][] matrizTotal, String artista) {
        for (int linha = 0; linha < matrizTotal.length; linha++) {


                System.out.println("Nome Música: " + matrizTotal[linha][0] + "\t" + "Género: " + matrizTotal[linha][2]);

        }
    }


    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int opcao;

        String[][] matrizTotal = lerFicheiroParaMatriz("Ficheiros/exercicio_11.csv");

        //imprimirMatrizConsola(matrizTotal);

        do {
            System.out.println("\n\n****** Programa de Analisar Músicas ******");

            System.out.println("2. Pesquisar músicas de um determinado artista");
            System.out.println("0. Sair");
            System.out.print("\nSelecione uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {


                case 2: // Pesquisar músicas de um determinado artista
                    System.out.println("\n*** Pesquisar músicas de um determinado artista ***");
                    System.out.print("Artista a pesquisar: ");

                    for (int linha = 0; linha < matrizTotal.length; linha++) {

                        //System.out.println("Nome Música: " + matrizTotal[linha][7]);
                    }
                    break;


                case 5: // Número de músicas no ficheiro
                    System.out.println("Músicas no ficheiro: " + matrizTotal.length);
                    break;

                case 0: // Sair
                    System.out.println("Obrigado, até logo!");
                    break;

                default: // Opção inválida
                    System.out.println("Opção Inválida... Tente novamente");
                    break;

            }
        } while (opcao != 0);
    }
}








