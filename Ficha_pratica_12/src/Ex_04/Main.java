package Ex_04;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(25, 10);
        Circulo circulo = new Circulo(18);
        Triangulo triangulo = new Triangulo(12,89);


        retangulo.calcularArea();
        circulo.calcularArea();
        triangulo.calcularArea();


    }
}
