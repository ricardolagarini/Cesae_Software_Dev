package Ficha_pratica_06;

import java.util.Scanner;

public class ex_02 {


    /**
     * Método que lê um inteiro positivo do utilizador
     * @return Número Inteiro Positivo
     */
    public static int lerInteiroPositivo(){

        Scanner input = new Scanner(System.in);

        int num;

        do{
            System.out.print("Insira um inteiro positivo: ");
            num=input.nextInt();
        }while(num<0);

        return num;
    }

    /**
     * Método que imprime uma quantidade de astericos recebida como parâmetro
     * @param numeroAsteriscos - Número de Asteriscos a Imprimir na Consola
     */
    public static void imprimirAsteriscos(int numeroAsteriscos){

        for(int i=0; i<numeroAsteriscos; i++){
            System.out.print("*");
        }
    }

    public static void main(String[] args) {

        imprimirAsteriscos(lerInteiroPositivo());
    }
}