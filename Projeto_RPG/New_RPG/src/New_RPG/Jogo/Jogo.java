package New_RPG.Jogo;

import New_RPG.Entidades.Heroi;
import New_RPG.Entidades.NPC;
import New_RPG.Itens.ArmaPrincipal;

public class Jogo {

    public static void main(String[] args) {

        ArmaPrincipal espadona = new ArmaPrincipal(5,8);
        NPC inimigo = new NPC("Goblin",100,100,3,50);
        //Heroi cavaleiro = new Heroi("Gaspar",100,100,20,1,10,espadona);



        //cavaleiro.atacar(inimigo);


    }


}
