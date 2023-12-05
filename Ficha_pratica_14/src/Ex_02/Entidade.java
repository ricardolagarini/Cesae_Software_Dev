package Ex_02;

public abstract class Entidade {
    private String nome;
    private int vida;
    private int forca;

    public Entidade(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }
}
