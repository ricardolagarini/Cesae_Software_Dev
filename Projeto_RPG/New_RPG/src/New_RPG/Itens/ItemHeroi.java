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
        System.out.print(this.nome+" - "+"Preço: " + this.preco+"$");
    }

    public ArrayList<String> getHeroisPermitidos() {
        return heroisPermitidos;
    }


    public void addHeroiPermItem (String classePermitda) {
        heroisPermitidos.add(classePermitda);
    }



    // criar um metodo para add heroi permitdo no ArrayList<String> heroisPermitidos;

    public void addHeroiPermItem (String classePermitda) {
        heroisPermitidos.add(classePermitda);
    }









}
