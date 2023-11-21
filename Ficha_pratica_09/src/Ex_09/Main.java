package Ex_09;

public class Main {
    public static void main(String[] args) {

        //Crie uma classe Produto que tenha os atributos nome, preço e quantidade em stock (deve ser inicializada a
        //0), e os métodos comprar e vender, que recebam a quantidade desejada como parâmetro e atualizem o stock.

        //a. Para vender um produto, deve analisar se existe stock suficiente. Caso exista stock suficiente deve
        //atualizar o stock. Caso não exista stock suficiente deve informar o utilizador que tal transação não é possível por quebra de stock do produto.

        //b. No método main, crie um objeto dessa classe Produto e chame o método para comprar 5 unidades.
        //c. Invoque o método para vender 2 unidades, e imprima a quantidade de stock.
        //d. Invoque o método para comprar 10 unidades.
        //e. Invoque o método para vender 35 unidades

        Produto bacalhau = new Produto("Bacalhau", 10);

        bacalhau.comprar(5);
        bacalhau.vender(2);
        bacalhau.comprar(10);
        bacalhau.vender(35);

    }
}
