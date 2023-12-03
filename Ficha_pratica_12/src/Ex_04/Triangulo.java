package Ex_04;

public class Triangulo extends FormaGeométrica {

    private double largura;
    private double altura;

    public Triangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = (largura * altura)/2;
        System.out.println("Área do Triangulo: " + area);
    }

}
