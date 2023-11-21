package Ex_01_a_b;

import Ex_01_a_b.Carro;
import Ex_01_a_b.TipoCombustivel;

public class Main {
    public static void main(String[] args) {

        Carro mercedesA45 = new Carro("Mercedes", "A45", 2023, 420, 2000, TipoCombustivel.GASOLINA, 12);
        Carro datsun = new Carro("Datsun", "1200", 1970, 90, 1200, TipoCombustivel.GASOLINA, 25);
        Carro ferrari = new Carro("Ferrari", "Super", 2023, 500, 1200, TipoCombustivel.DIESEL, 50);

        mercedesA45.ligar();
        datsun.ligar();
        ferrari.ligar();
    }
}