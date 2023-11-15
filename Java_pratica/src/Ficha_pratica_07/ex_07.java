package Ficha_pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex_07 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner fileScanner = new Scanner(new File("Ficheiros/exercicio_07.txt"));

        String linha;
        int numeroLinhas = 0, numeroPalavras = 0;

        while (fileScanner.hasNextLine()) {
            fileScanner.nextLine();
            numeroLinhas++;
        }

        while (fileScanner.hasNextLine()) {
            linha=fileScanner.nextLine();
            numeroLinhas++;

            if (!linha.isEmpty()) {              // Ver outra maneira
                String[] array = linha.split(" ");
                numeroPalavras += array.length; // numeroPalavras = numeroPalavras + array.length;
            }
        }

        System.out.println("Número de linhas: " + numeroLinhas);
        System.out.println("Número de palavras: " + numeroPalavras);
    }
}