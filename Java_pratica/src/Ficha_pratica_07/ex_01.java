package Ficha_pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static Ficha_pratica_07.BibliotecaFicheiros.*;

public class ex_01 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner fileScanner = new Scanner(new File("Ficheiros/exercicio_01_Alternativa02.txt"));

        String linha;

        while (fileScanner.hasNextLine()) {
            linha = fileScanner.nextLine();
            System.out.println(linha);
        }

        imprimirFicheiro("Ficheiros/exercicio_01.txt");
        imprimirFicheiro("Ficheiros/exercicio_01_Alternativa01.txt");
        imprimirFicheiro("Ficheiros/exercicio_01_Alternativa02.txt");
    }
}