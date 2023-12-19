package New_RPG.Tools;

import New_RPG.Itens.ArmaPrincipal;
import New_RPG.Itens.ConsumivelCombate;
import New_RPG.Itens.ItemHeroi;
import New_RPG.Itens.Pocao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CsvReader {

    private String filePath;
    public CsvReader(String filePath) {
        this.filePath = filePath;
    }


    public ArrayList<ItemHeroi> readCSVToRepository() throws FileNotFoundException {

        File file = new File(filePath);
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
            int ataque = Integer.parseInt(linhaDividida[4]);
            int ataqueEspecial = Integer.parseInt(linhaDividida[5]);
            int ataqueInstantaneo = Integer.parseInt(linhaDividida[6]);
            int vida = Integer.parseInt(linhaDividida[7]);
            int forca = Integer.parseInt(linhaDividida[8]);

            linha = linha.replace("[", "").replace("]", ""); // fazer na string heroi permitido

            if(linha.equals("ArmaPrincipal")) {
                ArmaPrincipal novaArmaprincipal = new ArmaPrincipal(nome, preco, ataque, ataqueEspecial); // fazer ciclo for para percorrer do array
            }

            if(linha.equals("ConsumivelCombate")) {
                ConsumivelCombate novoConsumivelCombate = new ConsumivelCombate(ataqueInstantaneo); // fazer ciclo for para percorrer do array
            }

            if(linha.equals("Pocao")) {
                Pocao novaPocao = new Pocao(vida, forca); // fazer ciclo for para percorrer do array
            }


        }

        return itensList;
    }




}
