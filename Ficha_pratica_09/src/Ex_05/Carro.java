package Ex_05;

public class Carro {

    private String marca;
    private String modelo;
    private int ano_fabrico;


    /**
     * Método construtor de Carro
     *@param ano_fabrico Ano de fabrico do carro
     * @param modelo Modelo  do carro
     * @param marca  Marca  do carro
     */
    public Carro(String marca, String modelo, int ano_fabrico) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano_fabrico = ano_fabrico;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAnoFabrico() {
        return this.ano_fabrico;
    }

    public void ligar(){
        System.out.println("O carro está ligado");
    }

}