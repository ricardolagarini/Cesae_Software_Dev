package Pizzaria;

public class IngredientePizza {
    private Ingrediente ingrediente;
    private double quantidade;

    public IngredientePizza(Ingrediente ingrediente, double quantidade) {
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    //passo 3
    public void exibirDetalhes(){
        this.ingrediente.exibirDetalhes(); // vai listar Ingrediente(String codigo, String nome, UnidadeMedida medidaIngrediente, double kcalUnidadeMedida)
        System.out.print(" : "+this.quantidade+" ");

        switch (this.ingrediente.getMedidaIngrediente()){
            case GRAMAS:
                System.out.println("g.");
                break;

            case LITROS:
                System.out.println("L.");
                break;

            case UNIDADES:
                System.out.println("uni.");
                break;
        }
    }



}
