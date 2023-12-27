package New_RPG.View;

import New_RPG.Controller.EstrategiaAtaque.EstrategiaAtaque;
import New_RPG.Controller.VendedorController;
import New_RPG.Domain.Entidades.Heroi;
import New_RPG.Domain.Itens.ArmaPrincipal;
import New_RPG.Domain.Itens.ItemHeroi;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //Heroi heroi = new Heroi("Ze_da_Manga",300,300,50,1,100, new ArmaPrincipal("Espada",5,10,15));

        VendedorController loja01 = new VendedorController();
        ArrayList<ItemHeroi> vendedor01 = loja01.criarLoja();

        loja01.imprimirLoja(vendedor01);

        //heroi.exibirStatus();






    }
}
