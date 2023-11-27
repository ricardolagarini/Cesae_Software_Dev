package Ex_02;

import Ex_02.Enums.TipoCombustivel;

public class Camiao extends Veiculo {

    double capacidaCarga;


    public Camiao(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double consumo, double capacidaCarga) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel, consumo);
        this.capacidaCarga = capacidaCarga;
    }


    public void calcularCarga(double cargaExtra, double distancia) {
        if(this.capacidaCarga>cargaExtra){
            double capAtual=this.capacidaCarga;
            capAtual+=cargaExtra;

        }


    }



}
