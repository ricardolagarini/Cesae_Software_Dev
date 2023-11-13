package Ficha_pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import static Ficha_pratica_07.BibliotecaFicheiros.imprimirFicheiro;

public class ex_02 {
    public static void main(String[] args) throws FileNotFoundException {

        // Criar o novo ficheiro
        File novoFicheiro = new File("Ficheiros/exercicio_02.txt");

        // Criar um maquina de escrever naquele ficheiro
        PrintWriter escritaNoFicheiro = new PrintWriter(novoFicheiro);

        String mensagem = "Vai todo mundo ficar bem empregado no final do curso!";

        escritaNoFicheiro.println(mensagem);

        escritaNoFicheiro.close();

        imprimirFicheiro("Ficheiros/exercicio_02.txt");
    }
}