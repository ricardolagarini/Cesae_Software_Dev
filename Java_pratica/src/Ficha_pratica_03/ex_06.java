package Ficha_pratica_03;

public class ex_06 {

    //Faça um programa que imprima os números inteiros de 1 a 100 inclusive, e no final imprima também o valor do
    //seu somatório. (Não necessita de Scanner ou input do utilizador)

    public static void main(String[] args) {

        int numero=1, soma=0;

        while (numero <= 100) {
            System.out.println(numero);

            soma = soma + numero;
            numero = numero + 1;

        }


        System.out.println("\nA somatória dos numeros é:"  +soma);

    }

}
