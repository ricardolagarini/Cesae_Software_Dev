package Ex_02;

import Ex_02.Enums.TipoCombustivel;

public class Main {

    public static void main(String[] args) {

        Carro carro01 = new Carro("BMW","C220",2019,200,1000, TipoCombustivel.GASOLINA,5,5);

        //consumo 5l s cada 100km


        carro01.calcularCusto(40);











    }


















}
