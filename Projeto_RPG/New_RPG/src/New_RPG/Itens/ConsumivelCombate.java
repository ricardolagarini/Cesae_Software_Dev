package New_RPG.Itens;

public class ConsumivelCombate extends Consumivel {

    private int ataqueInstantaneo;




    @Override
    public void mostrarDetalhes() {
        System.out.println( "Dano: "+ this.ataqueInstantaneo);;
    }

}
