package New_RPG.Itens;

public class Pocao extends Consumivel{
    private int vida;  // vida a curar
    private int forca; // força a aumentar


    public Pocao(int vida, int forca) {
        this.vida = vida;
        this.forca = forca;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println( "Poder de cura: "+ this.vida);;
        System.out.println( "Força + "+ this.forca);;
    }


    public int getVidaCurar() {
        return vida;
    }

    public int getAumentoForca() {
        return forca;
    }
}
