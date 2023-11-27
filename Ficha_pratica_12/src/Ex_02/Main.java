package Ex_02;

import Ex_02.Enums.TipoCombustivel;

public class Main {

    public static void main(String[] args) {

        Carro carro01 = new Carro("BMW","C220",2019,200,1000, TipoCombustivel.GASOLINA,15,5);
        Camiao camiao01 = new Camiao("volvo","V1000",2020,800,3000,TipoCombustivel.DIESEL,30,4000);



        //consumo 5l s cada 100km


        carro01.calcularCusto(50);











    }


















}
