package New_RPG.Itens;

public class Pocao extends Consumivel{
    private int vidaCurar;
    private int aumentoForca;



    @Override
    public void mostrarDetalhes() {
        System.out.println( "Poder de cura: "+ this.vidaCurar);;
        System.out.println( "Força + "+ this.aumentoForca);;
    }


}
