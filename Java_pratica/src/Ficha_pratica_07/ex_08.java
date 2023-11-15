package Ficha_pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;

public class ex_08 {

    public static void main(String[] args) throws FileNotFoundException {

        // Abrir o ficheiro
        Scanner fileScanner = new Scanner(new File("Ficheiros/exercicio_08.txt"));

        // Criar o novo ficheiro
        File novoFicheiro = new File("Ficheiros/exercicio_08_1.txt");

        // Criar um maquina de escrever naquele ficheiro
        PrintWriter escritaNoFicheiro = new PrintWriter(novoFicheiro);

        String linha, palavra="CESAE";

        while (fileScanner.hasNextLine()) {
            linha = fileScanner.nextLine();
            String[] array = linha.split(" ");

            for(int indice=0; indice<array.length; indice++) {
                if (array[indice].equals(palavra)) {
                    escritaNoFicheiro.println(linha);
                }
            }
        }
        escritaNoFicheiro.close();
    }
}


