package Ex_04;

public class Circulo extends FormaGeométrica{

    private double raio;


    public Circulo(double raio) {
        this.raio = raio;
    }


    @Override
    public void calcularArea() {
        double area = 3.14*(raio*raio);
        System.out.println("Área do Circulo: " + area);
    }

}
