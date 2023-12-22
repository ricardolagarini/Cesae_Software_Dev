package New_RPG.Jogo;

import New_RPG.Controller.VendedorController;
import New_RPG.Domain.Entidades.Heroi;
import New_RPG.Domain.Entidades.Vendedor;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);


        //Heroi heroi = new Heroi("Rodolfo",300,300,50,1,100);

        VendedorController venda = new VendedorController();
        venda.imprimirLoja();

        //heroi.exibirStatus();


    }
}

