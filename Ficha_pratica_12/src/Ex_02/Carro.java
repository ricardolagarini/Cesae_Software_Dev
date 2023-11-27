package Ex_02;

import Ex_02.Enums.TipoCombustivel;

public class Carro extends Veiculo {
    private int quantidadePassageiros=0;


    public Carro(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double consumo, int quantidadePassageiros) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel, consumo);
        this.quantidadePassageiros = quantidadePassageiros;
    }
}
