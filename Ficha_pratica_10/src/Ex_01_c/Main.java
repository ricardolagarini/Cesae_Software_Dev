package Ex_01_c;

import Ex_01.Carro;
import Ex_01.TipoCombustivel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira a marca: ");
        String marca = input.next();

        System.out.print("Insira o modelo: ");
        String modelo = input.next();

        System.out.print("Insira o ano: ");
        int ano = input.nextInt();

        System.out.print("Insira a potencia: ");
        int potencia= input.nextInt();

        System.out.print("Insira a cilindrada: ");
        int cilindrada = input.nextInt();

        System.out.print("Insira o Tipo de Combustivel (GASOLINA, DIESEL, GPL): ");
        String escolhaCombustivel = input.next();

        Ex_01.TipoCombustivel tipoCombustivel= null;
        switch (escolhaCombustivel){
            case "GASOLINA":
                tipoCombustivel= Ex_01.TipoCombustivel.GASOLINA;
                break;

            case "DIESEL":
                tipoCombustivel= Ex_01.TipoCombustivel.DIESEL;
                break;

            case "GPL":
                tipoCombustivel= Ex_01.TipoCombustivel.GPL;
                break;
        }

        System.out.print("Insira o consumo (L/100Km): ");
        double consumo = input.nextDouble();

        Ex_01.Carro carroUtilizador = new Ex_01.Carro(marca,modelo,ano,potencia,cilindrada,tipoCombustivel,consumo);
        Ex_01.Carro mercedesA45 = new Ex_01.Carro("Mercedes", "A45", 2023, 420, 2000, Ex_01.TipoCombustivel.GASOLINA, 12);
        Ex_01.Carro datsun = new Ex_01.Carro("Datsun", "1200", 1970, 90, 1200, Ex_01.TipoCombustivel.GASOLINA, 25);
        Ex_01.Carro ferrari = new Ex_01.Carro("Ferrari", "SF90", 2023, 800, 5000, TipoCombustivel.GASOLINA, 18);


        Ex_01.Carro vencedorCorrida1 = mercedesA45.corrida(datsun);
        Ex_01.Carro vencedorCorrida2 = carroUtilizador.corrida(ferrari);

        Carro vencedorFinal = vencedorCorrida1.corrida(vencedorCorrida2);
        System.out.println("Vencedor Final");
        vencedorFinal.exibirDetalhes();

    }
}