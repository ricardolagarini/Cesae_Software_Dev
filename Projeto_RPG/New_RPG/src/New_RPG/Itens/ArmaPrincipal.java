package New_RPG.Itens;

import New_RPG.Itens.ItemHeroi;

public class ArmaPrincipal extends ItemHeroi {

    private int ataque;
    private int ataqueEspecial;


    public ArmaPrincipal(int ataque, int ataqueEspecial) {
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getAtaque() {return ataque;}
    public int getAtaqueEspecial() {return ataqueEspecial;}


}
