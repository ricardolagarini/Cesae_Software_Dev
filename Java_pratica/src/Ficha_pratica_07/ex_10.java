package Ficha_pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex_10 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner fileScanner = new Scanner(new File("Ficheiros/exercicio_10.csv"));

        String linha=fileScanner.nextLine();;
        double quantidade_vendida, preco_unitario,total=0;

        while(fileScanner.hasNextLine()){
            linha=fileScanner.nextLine();
            String[] array = linha.split(",");

            quantidade_vendida = Double.parseDouble(array[2]);
            preco_unitario = Double.parseDouble(array[3]);

            total+= (quantidade_vendida*preco_unitario);
        }
        System.out.println("O total do valor é: " + total);
    }
}