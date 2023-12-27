package New_RPG.Controller.EstrategiaAtaque;

import New_RPG.Domain.Entidades.Entidade;
import New_RPG.Domain.Entidades.Heroi;
import New_RPG.Domain.Entidades.NPC;


public interface EstrategiaAtaque {

    Entidade atacar (Heroi heroi, NPC npc);



}
