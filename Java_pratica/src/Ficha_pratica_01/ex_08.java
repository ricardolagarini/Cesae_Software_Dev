package Ficha_pratica_01;

import java.util.Scanner;

public class ex_08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int segundostotais, minutostotais, segundostotaisalbum, horas, minutos, segundos;

        System.out.print("Introduza os minutos da música 1: ");
        minutostotais = input.nextInt();

        System.out.print("Introduza os segundos da música 1: ");
        segundostotais = input.nextInt();

        System.out.print("Introduza os minutos da música 2: ");
        minutostotais =  minutostotais + input.nextInt();

        System.out.print("Introduza os segundos da música 2: ");
        segundostotais = segundostotais + input.nextInt();

        System.out.print("Introduza os minutos da música 3: ");
        minutostotais =  minutostotais + input.nextInt();

        System.out.print("Introduza os segundos da música 3: ");
        segundostotais = segundostotais + input.nextInt();

        // calcular segundos totais do album
        segundostotaisalbum = (minutostotais*60) + segundostotais;

        // calcular horas
        horas = segundostotaisalbum/3600;

        //calcular minutos
        minutos = (segundostotaisalbum/60) - (horas*60);

        //calcular segundos
        segundos = segundostotaisalbum - (horas*3600) - (minutos*60);

        System.out.println("\nTotal de tempo do album é de: " + horas + "h " + minutos + "m " + segundos + "s");
    }
}
