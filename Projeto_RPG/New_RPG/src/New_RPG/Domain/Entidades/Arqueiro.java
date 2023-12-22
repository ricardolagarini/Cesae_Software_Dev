package New_RPG.Domain.Entidades;

import New_RPG.Domain.Itens.ArmaPrincipal;

public class Arqueiro extends Heroi {
    public Arqueiro(String nome, int maxHp, int hp, int forca, int nivel, int ouro, ArmaPrincipal armaPrincipal) {
        super(nome, maxHp, hp, forca, nivel, ouro, armaPrincipal);
    }
}
