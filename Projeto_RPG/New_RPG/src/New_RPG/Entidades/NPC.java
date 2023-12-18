package New_RPG.Entidades;

public class NPC extends Entidade{
    private int ouro;

    public NPC(String nome, int maxHp, int hp, int forca, int ouro) {
        super(nome, maxHp, hp, forca);
        this.ouro = ouro;
    }



    @Override
    public void atacar(Entidade heroi) {

    }
}
