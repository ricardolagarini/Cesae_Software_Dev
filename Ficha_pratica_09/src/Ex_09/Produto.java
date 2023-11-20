package Ex_09;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade_stock=0;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void comprar() {
        while(this.quantidade_stock==0);
        quantidade_stock=quantidade_stock+1;
        System.out.println(this.nome+quantidade_stock);

    }


    public void comprar(int unidades){
        if (this.quantidade_stock==0) {
            this.quantidade_stock++;
        }
        int estoque_atual=0;
        estoque_atual= this.quantidade_stock*unidades;
        System.out.println("Estoque atual agora é de: "+ estoque_atual);
    }





}
