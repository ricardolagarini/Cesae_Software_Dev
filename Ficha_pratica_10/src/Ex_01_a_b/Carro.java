package Ex_01_a_b;

import Ex_01_a_b.TipoCombustivel;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabrico;
    private int potencia;
    private int cilindrada;
    private TipoCombustivel tipoCombustivel;
    private double consumo;


    public Carro(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.consumo = consumo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }



    public void exibirDetalhes(){
        System.out.println(this.marca);
        System.out.println(this.modelo);
        System.out.println("Ano: "+this.anoFabrico);
        System.out.println("Potencia: "+ this.potencia+ " cv.");
        System.out.println("Cilindrada: "+this.cilindrada+" cc.");
    }


    public void ligar() {
        int idadeAtual = 2023 - this.anoFabrico;

        if (idadeAtual > 30) { // Mais de 30 anos

            if (this.tipoCombustivel.equals(TipoCombustivel.DIESEL)) { // Carro a diesel
                System.out.println(this.marca+" deita um pouco de fumo... Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum"+"\n");
            } else { // Carro não diesel
                System.out.println(this.marca+" custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum"+"\n");
            }

        } else { // 30 anos ou mais recente

            if (this.potencia < 250) { // Menos de 250 cavalos
                System.out.println(this.marca+" está ligado!");
                System.out.println("Vrummmmmmmmmmmmmmmmmmm"+"\n");
            } else { // 250 ou mais cavalos
                System.out.println(this.marca+" está ligado!");
                System.out.println("VRUMMMMMMMMMMMMMMMMMMMM"+"\n");
            }

        }
    }

}
