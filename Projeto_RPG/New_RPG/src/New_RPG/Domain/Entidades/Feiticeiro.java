package New_RPG.Domain.Entidades;

import New_RPG.Domain.Itens.ArmaPrincipal;

public class Feiticeiro extends Heroi {
    public Feiticeiro(String nome, int maxHp, int hp, int forca, int nivel, int ouro, ArmaPrincipal armaPrincipal) {
        super(nome, maxHp, hp, forca, nivel, ouro, armaPrincipal);
    }
}
