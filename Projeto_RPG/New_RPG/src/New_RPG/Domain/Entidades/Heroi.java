package New_RPG.Domain.Entidades;

import New_RPG.Domain.Itens.ArmaPrincipal;
import New_RPG.Domain.Itens.Consumivel;
import New_RPG.Domain.Itens.ItemHeroi;

import java.util.ArrayList;

public class Heroi extends Entidade { // colocar de volta o "abstract" para testar

    private int nivel;
    private int ouro;
    private ArmaPrincipal armaPrincipal;
    private ArrayList<Consumivel> inventario;

    public Heroi(String nome, int maxHp, int hp, int forca, int nivel, int ouro, ArmaPrincipal armaPrincipal) {
        super(nome, maxHp, hp, forca);
        this.nivel = nivel;
        this.ouro = ouro;
        this.armaPrincipal = armaPrincipal;
        this.inventario = new ArrayList<>();
    }

    public int getNivel() {return nivel; }
    public int getOuro() {return ouro;}
    public ArmaPrincipal getArmaPrincipal() {return armaPrincipal;}
    public ArrayList<Consumivel> getInventario() {return inventario;}

    // Metodo para add itens no inventario
    public void addItensInventario(Consumivel novoItem){inventario.add(novoItem);}

    // Metodo para comprar itens
    public void pagarOuro(int preco) {this.ouro -= preco;}

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


    public void exibirStatus(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Nivel: "+this.getNivel());
        System.out.println("HP: "+this.getHp() + "/" + this.getMaxHp());
        System.out.println("Força: "+this.getForca());
        System.out.println("Ouro: "+this.getOuro());
        System.out.println("Arma equipada: "+this.getArmaPrincipal());
    }


}
