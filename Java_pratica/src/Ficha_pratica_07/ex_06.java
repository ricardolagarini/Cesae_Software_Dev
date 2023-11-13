package Ficha_pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner fileScanner = new Scanner(new File("Ficheiros/exercicio_06.txt"));

        int maior;
        String linha = "Joaquim Silva,21";
        String[]itensDaLinha = linha.split(",");


        for(int indice=0;indice<itensDaLinha.length;indice++){
            System.out.println(itensDaLinha[indice]);

        }



        while (fileScanner.hasNextLine()) {
            maior = fileScanner.nextInt();

            if(fileScanner.nextInt()> maior){
                maior = fileScanner.nextInt();
            }

        }

        System.out.println("A pessoa mais velha é: " + fileScanner.nextInt());
    }
}