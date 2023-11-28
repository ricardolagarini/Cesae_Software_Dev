package Ex_02;

import Ex_02.Enums.TipoCombustivel;

public class Main {

    public static void main(String[] args) {

        Carro carro01 = new Carro("BMW","C220",2019,200,1000, TipoCombustivel.GASOLINA,15,5);
        Carro carro02 = new Carro("Mercedes", "EQB", 2022, 296, 4000, TipoCombustivel.ELETRICO, 1, 7);
        Camiao camiao01 = new Camiao("volvo","V1000",2020,800,3000,TipoCombustivel.DIESEL,30,4000);



        carro01.calcularCusto(50);
        carro02.calcularCusto(50);

        System.out.println("\n*****************************************");

        camiao01.calcularCarga(400,100);

        System.out.println("\n*****************************************");






    }


















}
