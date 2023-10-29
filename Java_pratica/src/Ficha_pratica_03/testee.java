package Ficha_pratica_03;

import java.awt.*;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class testee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de início do intervalo: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o valor de fim do intervalo: ");
        int fim = scanner.nextInt();

        System.out.println("Múltiplos de 5 entre " + inicio + " e " + fim + ":");

        for (int i = inicio; i <= fim; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
