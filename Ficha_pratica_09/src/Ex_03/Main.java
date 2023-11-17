package Ex_03;

public class Main {
    public static void main(String[] args) {

        // Instanciar um retangulo
        Retangulo retangulo_01 = new Retangulo(10, 7);
        Retangulo retangulo_02 = new Retangulo(200, 15);

        // Calcular e apresentar área
        System.out.println("\nÁrea do retangulo (1): " + retangulo_01.calcularArea());

        // Calcular e apresentar perímetro
        System.out.println("Perímetro do retangulo (1): " +retangulo_01.calcularPerimetro());

        System.out.println("\nÁrea do retangulo (2): " + retangulo_02.calcularArea());
        System.out.println("Perímetro do retangulo (2): " +retangulo_02.calcularPerimetro());

    }
}