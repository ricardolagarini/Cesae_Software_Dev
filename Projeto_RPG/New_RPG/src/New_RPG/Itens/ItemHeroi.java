package New_RPG.Itens;

import java.util.ArrayList;

public abstract class ItemHeroi {
    private String nome;
    private int preco;
    ArrayList<String> heroisPermitidos;



    //^^^^^^desenvolver construtor de item^^^^^^

    public void mostrarDetalhes(){
        System.out.println( "Nome: " + this.nome);
        System.out.println( "Preço" + this.preco+" $");
        System.out.println( "Heroi permitido: " + this.heroisPermitidos);
    }



















}
