package Ficha_pratica_06;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class ex_01 {

    public static void fazerBarulho(String animal) {

        switch (animal) {
            case "cao":
                System.out.println("Au au au ");
                break;

            case "gato":
                System.out.println("Miau");
                break;

            case "peixe":
                System.out.println("Glub Glub");
                break;

            case "vaca":
                System.out.println("Muuuu");
                break;

            case "porco":
                System.out.println("Oinc oinc");
                break;

            default:
                System.out.println("Barulho Desconhecido");

        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String animalEscolhido;

        System.out.print("Insira um animal: ");
        animalEscolhido=input.next();

        fazerBarulho(animalEscolhido);

        System.out.print("Insira um animal: ");
        animalEscolhido=input.next();

        fazerBarulho(animalEscolhido);
    }

}