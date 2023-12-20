package New_RPG.Entidades;

import New_RPG.Itens.ItemHeroi;
import New_RPG.Repository.RepositoryItens;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class Vendedor {
    private ArrayList<ItemHeroi> loja;

    public Vendedor() throws FileNotFoundException {
        RepositoryItens repositoryItens = new RepositoryItens();
        this.loja = repositoryItens.getItensList();
    }

    public void imprimirLoja(){
        Random random = new Random();
        ArrayList<Integer> itemAleatorio = new ArrayList<>();
        while (itemAleatorio.size() < 10) {
            int tempRandom = random.nextInt(0, this.loja.size());
            if (!itemAleatorio.contains(tempRandom)) {
                itemAleatorio.add(tempRandom);
            }
        }

        System.out.println("------------------------------------------------------------------------------------------\n" +
                " _                 _             ____                                 _   _              |\n" +
                " | |       ___     (_)   __ _    / ___|   _   _   ___   _ __     ___  (_) | |_    __ _   |\n" +
                " | |      / _ \\    | |  / _` |   \\___ \\  | | | | / __| | '_ \\   / _ \\ | | | __|  / _` |  |   \n" +
                " | |___  | (_) |   | | | (_| |    ___) | | |_| | \\__ \\ | |_) | |  __/ | | | |_  | (_| |  |\n" +
                " |_____|  \\___/   _/ |  \\__,_|   |____/   \\__,_| |___/ | .__/   \\___| |_|  \\__|  \\__,_|  |\n" +
                "                 |__/                                  |_|                               |\n" +
                "------------------------------------------------------------------------------------------");
        System.out.println("");

        for (Integer indice : itemAleatorio) {
            //System.out.print((itemAleatorio.indexOf(indice) + 1) + ". : ");
            this.loja.get(indice).mostrarDetalhes();
        }
    }
}
