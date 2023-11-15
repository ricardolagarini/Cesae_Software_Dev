package Proj_pratico;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class proj_01 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        String opcaoUsuario;


        do {
            System.out.print("(ADMIN ou CLIENTE): ");
            opcaoUsuario = input.next();


            switch (opcaoUsuario) {
                case "ADMIN":

                    break;
                case "CLIENTE":

                    break;
                default:
                    System.out.println("Tipo de utilizador inválido.");
            }


        } while (!opcaoUsuario.equals("ADMIN");
    }
}