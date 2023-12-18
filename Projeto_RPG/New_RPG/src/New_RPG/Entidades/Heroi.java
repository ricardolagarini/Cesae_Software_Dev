package New_RPG.Entidades;

import New_RPG.Itens.ArmaPrincipal;
import New_RPG.Itens.Consumivel;

import java.util.ArrayList;

public abstract class Heroi extends Entidade {

    private int nivel;
    private int ouro;
    ArmaPrincipal armaPrincipal;
    ArrayList<Consumivel> inventario;


    public Heroi(String nome, int maxHp, int hp, int forca, int nivel, int ouro, ArmaPrincipal armaPrincipal) {
        super(nome, maxHp, hp, forca);
        this.nivel = nivel;
        this.ouro = ouro;
        this.armaPrincipal = armaPrincipal;
        ArrayList<Consumivel> inventario;
    }

    @Override
    public void atacar(Entidade inimigo) { // ENTIDADE OU HEROI?
        if (inimigo instanceof NPC && inimigo.estaVivo()) {
            NPC monstro = new NPC() ;   // ESTA PEDINDO CONSTRUTOR
            int vidaAtual= monstro.getHp(); // NAO ACESSA

            vidaAtual -= getForca();
            System.out.println(getNome() + " atacou " + monstro.getNome() + " causando " + getForca() + " de dano.");
            if (!monstro.estaVivo()) {
                System.out.println(monstro.getNome() + " foi derrotado!");
            }

        }
    }







}
