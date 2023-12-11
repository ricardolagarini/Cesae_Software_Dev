package Ex_02;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("******** CRIADOR DE TACOS ********");
        System.out.println("Selecione o tipo de recheio do Taco");
        System.out.println("[Carne de Vaca][Carne de Frango][Vegetariano]: ");
        String tipo = input.nextLine();

        Taco tacoNovo = TacoFactory.criarProduto(tipo);

        System.out.println("O que fazer com o Taco?");
        System.out.println("1. COZINHAR");
        System.out.println("2. PREPARAR");
        System.out.println("3. EMBALAR");
        int acao = input.nextInt();

        switch (acao) {
            case 1:
                tacoNovo.bake();
                break;
            case 2:
                tacoNovo.prepare();
                break;
            case 3:
                tacoNovo.box();
                break;
            default:
                throw new IllegalArgumentException("Opcao invalida");

        }
    }
}