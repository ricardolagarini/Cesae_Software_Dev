package Ficha_pratica_extra_condicionais;

import java.util.Objects;
import java.util.Scanner;

public class ex_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char letra;

        System.out.print("Digite uma letra minúscula do alfabeto: ");
        letra = input.next().charAt(0);

        if (letra >= 'a' && letra <= 'z') {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("\nA letra " + letra + " é uma vogal.");
            } else {
                System.out.println("\nA letra " + letra + " é uma consoante.");
            }
        } else {
            System.out.println("\nIsso não é uma letra minúscula do alfabeto.");
        }
    }
}
