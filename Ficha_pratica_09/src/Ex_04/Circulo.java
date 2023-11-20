package Ex_04;

public class Circulo {

    private double raio;


    /**
     * Método construtor de um Circulo
     *
     * @param raio Raio (cm.)
     *
     */
    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return (3.14*(this.raio * this.raio));
    }


}