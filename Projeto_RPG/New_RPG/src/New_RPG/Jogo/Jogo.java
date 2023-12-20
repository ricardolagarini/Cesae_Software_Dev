package New_RPG.Jogo;

import New_RPG.Entidades.Heroi;
import New_RPG.Entidades.Vendedor;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        Heroi heroi = null;


        Vendedor venda = new Vendedor();
        venda.imprimirLoja();


    }
}

