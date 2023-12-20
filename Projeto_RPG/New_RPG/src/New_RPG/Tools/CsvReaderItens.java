package New_RPG.Tools;

import New_RPG.Itens.ArmaPrincipal;
import New_RPG.Itens.ConsumivelCombate;
import New_RPG.Itens.ItemHeroi;
import New_RPG.Itens.Pocao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CsvReaderItens {

<<<<<<< HEAD
    private String filePath = "Ficheiros/ItensHeroiRPG.csv";

    public CsvReaderItens() {
        this.filePath = filePath;
    }

=======
    private String filePath;

    public CsvReaderItens() {
        this.filePath = "Ficheiros/itens.csv";
    }

>>>>>>> d688a37b59880cfcfd3c2ab954e03a6dee577405
    public ArrayList<ItemHeroi> readCSVToRepository() throws FileNotFoundException {

        File file = new File(this.filePath);
        Scanner scanner = new Scanner(file);
        String linha = scanner.nextLine();

        ArrayList<ItemHeroi> itensList = new ArrayList<>();

        while (scanner.hasNextLine()) {

            linha = scanner.nextLine();
            String[] linhaDividida = linha.split(";");

            String tipo = linhaDividida[0];
            String nome = linhaDividida[1];
            int preco = Integer.parseInt(linhaDividida[2]);

            String heroisPermitidos = linhaDividida[3];
<<<<<<< HEAD
            heroisPermitidos.replace("[", " ");
            heroisPermitidos.replace("]", " ");
=======
            heroisPermitidos=heroisPermitidos.replace("[", "");
            heroisPermitidos=heroisPermitidos.replace("]", "");
>>>>>>> d688a37b59880cfcfd3c2ab954e03a6dee577405
            String [] itemClass = heroisPermitidos.split(",");

            int ataque = Integer.parseInt(linhaDividida[4]);
            int ataqueEspecial = Integer.parseInt(linhaDividida[5]);
            int ataqueInstantaneo = Integer.parseInt(linhaDividida[6]);
            int vida = Integer.parseInt(linhaDividida[7]);
            int forca = Integer.parseInt(linhaDividida[8]);

            ItemHeroi novoItemHeroi = null;

            if(tipo.equals("ArmaPrincipal")) {
                novoItemHeroi = new ArmaPrincipal(nome, preco, ataque, ataqueEspecial);
            }

            if(tipo.equals("ConsumivelCombate")) {
<<<<<<< HEAD
                novoItemHeroi = new ConsumivelCombate(ataqueInstantaneo);
            }

            if(tipo.equals("Pocao")) {
                novoItemHeroi = new Pocao(vida, forca);
=======
                novoItemHeroi = new ConsumivelCombate(nome, preco, ataqueInstantaneo);
            }

            if(tipo.equals("Pocao")) {
                novoItemHeroi = new Pocao(nome, preco, vida, forca);
>>>>>>> d688a37b59880cfcfd3c2ab954e03a6dee577405
            }

            for (int i = 0; i < itemClass.length; i++) {
                novoItemHeroi.addHeroiPermItem(itemClass[i]);
            }

            itensList.add(novoItemHeroi);

        }

        return itensList;
    }




}
