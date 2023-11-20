package Ex_04;

public class Main {
    public static void main(String[] args) {

        //Escreva um programa onde cria uma classe chamada "Circulo" com um atributo raio.
        //a. Instancie um círculo.
        //b. Crie métodos para calcular a área e a circunferência do círculo

        // Instanciar um Circulo
        Circulo circulo_01 = new Circulo(10);
        Circulo circulo_02 = new Circulo(35);
        Circulo circulo_03 = new Circulo(88);

        // Calcular e apresentar área do circulo
        System.out.println("\nÁrea do circulo (1): " + circulo_01.calcularArea());
        System.out.println("\nÁrea do circulo (2): " + circulo_02.calcularArea());
        System.out.println("\nÁrea do circulo (3): " + circulo_03.calcularArea());
    }
}