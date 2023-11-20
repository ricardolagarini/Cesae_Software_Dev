package Proj_pratico;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
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
        int cont=0;
        for (int linha = 0; linha < matrizTotal.length; linha++) {

            // Verifica as colunas até a linha atual para checar se ha jogos repetidos
            for (int coluna = 0; coluna < linha; coluna++) {

                // Verifica se o jogo na linha atual é igual ao jogo na linha anterior e se ainda não foi listado
                if (linha != coluna && matrizTotal[linha][7].equals(matrizTotal[coluna][7])&&cont==0) {
                   cont++; // Contador +1 se econtrar um jogo repetido
                }
            }
            // Se o jogo ainda nao foi listado, imprime nome do jogo
            if(cont==0) {
                System.out.println("Jogo: " + matrizTotal[linha][7]);
            }
            else {
            cont=0; // Reinicia o contador para a próx loop caso encntre jogo repetido
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


    /**
     * Método para imprimir na consola o conteudo de um ficheiro
     * @param caminho Caminho do Ficheiro
     * @throws FileNotFoundException Se não encontrar o ficheiro no caminho especificado
     */
    public static void imprimirFicheiro(String caminho) throws FileNotFoundException {
        // Instanciar o Scanner para um ficheiro com o caminho recebido como parâmetro
        Scanner fileScanner = new Scanner(new File(caminho));
        String linha;
        while (fileScanner.hasNextLine()) {
            linha = fileScanner.nextLine();
            linha = linha.replace(";", " | "); // Substituir ";" por "|"
            System.out.println(linha);
        }
    }


    /**
     * Método para listar iDS clientes do ficheiro
     *
     * @param matrizTotal Matriz a pesquisar
     */
    public static void idClientesFicheiro(String[][] matrizTotal) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o ID de cliente a ser pesquisado (1-60): ");

        int cont=0;
        String clienteInf = input.nextLine();
        for (int linha = 0; linha < matrizTotal.length; linha++) {

            // Verifica se o ID do cliente na linha atual é igual ao ID fornecido pelo usuario
            if (matrizTotal[linha][1].equals(clienteInf)&&cont==0) {
                cont++; // Contador +1 para evitar repetiçao do ID
                System.out.println("ID: "+matrizTotal[linha][1] +" | "+ "Nome: "+matrizTotal[linha][2] +" | "+ "Telefone: "+matrizTotal[linha][3] +" | "+"Email: " +matrizTotal[linha][4]);
            }
        }
    }



    /**
     * Método para listar quantas vendas foram executadas e o seu valor total
     *
     * @param matrizTotal Matriz a pesquisar
     */
    public static void regVendasTot(String[][] matrizTotal) {
        double valorTotal = 0;
        int quantVendas = 0; // Qtde vendas iniciado a zer
        for (int linha = 0; linha < matrizTotal.length; linha++) {
            double valor = Double.parseDouble(matrizTotal[linha][8]);
            valorTotal += valor;
            quantVendas++; // quando terminar de somar a ultima linha de valor, tem se a qtd de vendas = qtd de linhas do ficheiro
        }
        System.out.println("Número de vendas: " + quantVendas);
        System.out.println("Valor total das vendas: " + valorTotal + " €");
    }


    /**
     * Método para listar valor total de vendas + 20%
     *
     * @param matrizTotal Matriz a pesquisar
     */
    public static void VendasTotLucro(String[][] matrizTotal) {
        double valorTotal = 0;
        for (int linha = 0; linha < matrizTotal.length; linha++) {
            double valor = Double.parseDouble(matrizTotal[linha][8]);
            valorTotal += valor;
        }
        double lucroTotal=((valorTotal)*0.2)+((valorTotal));
        System.out.println("Valor total do lucro de 20%: " + (valorTotal)*0.2 + " €");
        System.out.println("Valor total do lucro de 20% + vendas totais: " + lucroTotal + " €");
    }


    /**
     * Método para listar jogo mais caro e os clientes que o compraram
     *
     * @param matrizTotal Matriz a pesquisar
     */
    public static void jogoMaisCaro(String[][] matrizTotal) {
        double precoMaior = 0;
        String jogoMaior = "", clienteJogoMaior="";
        int linha = 0;

        while (linha < matrizTotal.length) {
            double precoJogo = Double.parseDouble(matrizTotal[linha][8]);

            // Verifica se o preço do jogo atual é maior que o preço do jogo mais caro registrado até o momento
            if (precoJogo > precoMaior) {
                precoMaior = precoJogo; // Atualiza o preço mais caro
                jogoMaior = matrizTotal[linha][7]; // Atualiza o nome do jogo mais caro
                clienteJogoMaior = matrizTotal[linha][2]; // guardar o primeiro cliente do jogoMaior

                // Se encontrar um jogo com o mesmo preço que o jogo mais caro, entao =clientes que comprarar o jogo
            } else if (precoJogo == precoMaior && jogoMaior.equals(matrizTotal[linha][7])) {
                clienteJogoMaior = clienteJogoMaior + ", " + matrizTotal[linha][2];
            }
            linha++;
        }
        System.out.println("\nJogo mais caro é o " + jogoMaior +" e custa " +precoMaior+ " €");
        System.out.println("Clientes que compraram esse jogo: " + clienteJogoMaior);
    }



    /**
     * Método para listar jogos por categoria do ficheiro e imprmir esteticamente
     *
     * @param matrizTotal Matriz a pesquisar
     */
    public static void jogosPorcategoria(String[][] matrizTotal) {
            Scanner input = new Scanner(System.in);
            System.out.print("Editora a pesquisar: ");
            String editora = input.nextLine();

            for (int linha = 0; linha < matrizTotal.length; linha++) {
                if (matrizTotal[linha][5].equals(editora)) {
                    System.out.println("Categoria: " + matrizTotal[linha][6] +  " - " + matrizTotal[linha][7]);
                }
            }
    }


}








