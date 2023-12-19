package New_RPG.Itens;

import java.util.ArrayList;

public abstract class ItemHeroi {
    private String nome;
    private int preco;
    ArrayList<String> heroisPermitidos;


    public ItemHeroi(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
        this.heroisPermitidos = new ArrayList<>();
    }

    public void mostrarDetalhes(){
        System.out.println( "Nome: " + this.nome);
        System.out.println( "Preço" + this.preco+" $");
        System.out.println( "Heroi permitido: " + this.heroisPermitidos);
    }



















}
