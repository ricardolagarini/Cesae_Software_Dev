package Ex_09;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade_stock=0;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void comprar(int unidades){
        this.quantidade_stock+=unidades;
        System.out.println("Após a compra, o estoque atual de "+this.nome+" é de "+this.quantidade_stock + " unidades.");
    }

    public void vender(int unidades){
        if (this.quantidade_stock>=unidades) {
            this.quantidade_stock-=unidades;
            System.out.println("Após a venda, o estoque atual de "+this.nome+" é de "+this.quantidade_stock + " unidades.");

        }else{
            System.out.println("Não existe stock suficiente para a operação.");
        }
    }
}
