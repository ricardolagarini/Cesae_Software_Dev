package New_RPG.Controller;

import New_RPG.Domain.Entidades.Heroi;
import New_RPG.Domain.Itens.ArmaPrincipal;
import New_RPG.Domain.Itens.Consumivel;
import New_RPG.Domain.Itens.ItemHeroi;
import New_RPG.Repository.RepositoryItens;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class VendedorController {
    private ArrayList<ItemHeroi> arrayItens;

    public VendedorController() throws FileNotFoundException {
        RepositoryItens repositoryItens = new RepositoryItens();
        this.arrayItens = repositoryItens.getItensList();
    }

    public ArrayList<ItemHeroi> criarLoja() {
        ArrayList<ItemHeroi> lojaSuspeita = new ArrayList<>(10);
        ArrayList<Integer> itemAleatorio = new ArrayList<>(10);
        Random random = new Random();

        while (itemAleatorio.size() < 10) {
            int tempRandom = random.nextInt(0, this.arrayItens.size());
            if (!itemAleatorio.contains(tempRandom)) {
                itemAleatorio.add(tempRandom);
                lojaSuspeita.add(arrayItens.get(tempRandom));
            }
        }
        return lojaSuspeita;
    }

    public void imprimirLoja(ArrayList<ItemHeroi> lojaSuspeita) {

        System.out.println("------------------------------------------------------------------------------------------\n" +
                " _                 _             ____                                 _   _              |\n" +
                " | |       ___     (_)   __ _    / ___|   _   _   ___   _ __     ___  (_) | |_    __ _   |\n" +
                " | |      / _ \\    | |  / _` |   \\___ \\  | | | | / __| | '_ \\   / _ \\ | | | __|  / _` |  |   \n" +
                " | |___  | (_) |   | | | (_| |    ___) | | |_| | \\__ \\ | |_) | |  __/ | | | |_  | (_| |  |\n" +
                " |_____|  \\___/   _/ |  \\__,_|   |____/   \\__,_| |___/ | .__/   \\___| |_|  \\__|  \\__,_|  |\n" +
                "                 |__/                                  |_|                               |\n" +
                "------------------------------------------------------------------------------------------");

        for (ItemHeroi itemHeroiAtual : lojaSuspeita) {
            itemHeroiAtual.mostrarDetalhes();
        }
    }

    public void vender(Heroi heroi, ArrayList<ItemHeroi> lojaSuspeita) {


        if (heroi.getOuro() >= lojaSuspeita.get(arrayItens.indexOf())) {

            if (itemCompra instanceof ArmaPrincipal) {
                heroi.setArmaPrincipal((ArmaPrincipal) itemCompra);
            } else {
                heroi.addItensInventario((Consumivel) itemCompra);
            }

            int ouroAtual = heroi.getOuro();
            ouroAtual -= itemCompra.getPreco();
            heroi.setOuro(ouroAtual);

            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Você não tem ouro suficiente para comprar " + itemCompra);
        }

        System.out.println("");
        System.out.println("1. Comprar itens");
        System.out.println("2. Sair");
        System.out.print("O que deseja fazer?");
        Scanner input = new Scanner(System.in);

            int opcao= input.nextInt();

            switch (opcao){

                case 1:
                    System.out.print("\nEscreva o nome do item que deseja comprar: ");
                    String itemCompra= input.next();

                    //vender(heroi,itemCompra);


                    break;


                case 2:
                    break;

            }



    }



}
