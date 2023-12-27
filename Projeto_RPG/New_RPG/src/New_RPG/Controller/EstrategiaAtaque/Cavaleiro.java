package New_RPG.Controller.EstrategiaAtaque;

import New_RPG.Domain.Entidades.Entidade;
import New_RPG.Domain.Entidades.Heroi;
import New_RPG.Domain.Entidades.NPC;
import New_RPG.Domain.Itens.ArmaPrincipal;

public class Cavaleiro implements EstrategiaAtaque{
    @Override
    public Entidade atacar(Heroi heroi, NPC npc) {
        int vidaHeroi = heroi.getHp();
        int vidaNpc = npc.getHp();

        int danoInimigo = (int) (0.8 * npc.getForca());
        vidaHeroi-= danoInimigo;

        int danoHeroi = heroi.getForca() + heroi.getArmaPrincipal().getAtaque();
        vidaNpc-=danoHeroi;

        return null;
    }
}
