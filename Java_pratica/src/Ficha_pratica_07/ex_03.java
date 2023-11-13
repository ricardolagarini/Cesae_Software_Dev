package Ficha_pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static Ficha_pratica_07.BibliotecaFicheiros.*;

public class ex_03 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner fileScanner = new Scanner(new File("Ficheiros/exercicio_03.txt"));

        // Criar o novo ficheiro
        File novoFicheiro = new File("Ficheiros/exercicio_03_1.txt");

        // Criar um maquina de escrever naquele ficheiro
        PrintWriter escritaNoFicheiro = new PrintWriter(novoFicheiro);

        String linha;

        while (fileScanner.hasNextLine()) {
            linha = fileScanner.nextLine();
            escritaNoFicheiro.println(linha);
        }

        escritaNoFicheiro.close();
    }
}


