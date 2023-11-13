package Ficha_pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static Ficha_pratica_07.BibliotecaFicheiros.imprimirFicheiro;

public class ex_05 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner fileScanner = new Scanner(new File("Ficheiros/exercicio_05_31.txt"));

        int valor, soma=0;

        while (fileScanner.hasNextLine()) {
            valor= fileScanner.nextInt();
            soma += valor;
        }

        System.out.println("Soma do ficheiro é: " + soma);
    }
}