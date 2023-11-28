package Ex_02;

import Ex_02.Enums.TipoCombustivel;

public class Camiao extends Veiculo {

    double capacidaCarga;


    public Camiao(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double consumo, double capacidaCarga) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel, consumo);
        this.capacidaCarga = capacidaCarga;
    }


    public void calcularCarga(double cargaExtra, double distancia) {
        double diesel=1.95;

        if(this.capacidaCarga>cargaExtra){
            double litrosConsumidos = calcularConsumo(distancia);
            double litroExtra= cargaExtra/1000;
            litrosConsumidos += litroExtra;

            double valorViagem = litrosConsumidos * diesel;

            System.out.println("Carga adicionada.");
            System.out.println("Consumo da viagem: "+litrosConsumidos+"L");
            System.out.println("Custo da viagem: "+valorViagem+"€");

        }else {
            System.out.println("Carga Max ultrapassada, a viagem não será feita.");
        }
    }



}
