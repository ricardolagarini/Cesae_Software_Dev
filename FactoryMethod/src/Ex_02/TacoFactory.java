package Ex_02;

import java.util.Scanner;

public class TacoFactory {
    public static Taco criarProduto(String tipoProduto) {
        tipoProduto=tipoProduto.toLowerCase();

        switch (tipoProduto) {
            case "carne de vaca":
                return new TacoCarne();

            case "carne de frango":
                return new TacoFrango();

            case "vegetariano":
                return new TacoVegetariano();

            default:
                throw new IllegalArgumentException("Tipo de recheio Inválido: "+tipoProduto);
        }
    }
}

