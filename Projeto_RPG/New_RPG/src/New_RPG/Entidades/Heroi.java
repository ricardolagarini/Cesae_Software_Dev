package New_RPG.Entidades;

import New_RPG.Itens.ArmaPrincipal;
import New_RPG.Itens.Consumivel;

import java.util.ArrayList;

public abstract class Heroi extends Entidade {     //  TIRAR ABSTRACT PARA TESTE

    private int nivel;
    private int ouro;
    private ArmaPrincipal armaPrincipal;
    private ArrayList<Consumivel> inventario;


    public Heroi(String nome, int maxHp, int hp, int forca, int nivel, int ouro, ArmaPrincipal armaPrincipal) {
        super(nome, maxHp, hp, forca);
        this.nivel = nivel;
        this.ouro = ouro;
        this.armaPrincipal = armaPrincipal;
        ArrayList<Consumivel> inventario;

    }

    public void atacar(NPC inimigo) {

        if (inimigo != null && inimigo.estaVivo()) {
            int vidaAtual= inimigo.getHp();

            while (vidaAtual>0) {
                System.out.println(getNome() + " atacou " + inimigo.getNome() + " causando " + getForca() + " de dano.");
                vidaAtual -= getForca();
            }

            if (vidaAtual==0) {
                System.out.println(inimigo.getNome() + " foi derrotado!");
            }

        }
    }

    public void udarPocao(){

    }


}
