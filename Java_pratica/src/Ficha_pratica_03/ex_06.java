package Ficha_pratica_03;

public class ex_06 {
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
