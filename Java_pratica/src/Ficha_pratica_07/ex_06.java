package Ficha_pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner fileScanner = new Scanner(new File("Ficheiros/exercicio_06.txt"));

        int maior=0;
        String linha,nomeVelho = "";

        while (fileScanner.hasNextLine()) {
            linha=fileScanner.nextLine();
            String[] itensDaLinha = linha.split(",");

            if(Integer.parseInt(itensDaLinha[1])>maior){
                maior=Integer.parseInt(itensDaLinha[1]);
                nomeVelho = itensDaLinha[0];
            }
        }
        System.out.println("A pessoa mais velha é o " + nomeVelho + " com " + maior + " anos de idade.");
    }
}