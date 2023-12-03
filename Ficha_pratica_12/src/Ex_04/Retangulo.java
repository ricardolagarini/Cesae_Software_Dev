package Ex_04;

public class Retangulo extends FormaGeométrica {

    private double largura;
    private double comprimento;

    public Retangulo(double largura, double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    @Override
    public void calcularArea() {
        double area = largura * comprimento;
        System.out.println("Área do Retângulo: " + area);
    }

}
