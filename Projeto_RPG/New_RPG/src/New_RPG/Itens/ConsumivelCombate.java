package New_RPG.Itens;

public class ConsumivelCombate extends Consumivel {

    private int ataqueInstantaneo;


    public int getAtaqueInstantaneo() {
        return ataqueInstantaneo;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println( "Dano: "+ this.ataqueInstantaneo);;
    }

}
