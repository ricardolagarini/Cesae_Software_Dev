package Ex_02;

import Ex_01.Pessoa;

public class Main {
    public static void main(String[] args) {

        // Instanciar 3 caes
        Cao goiaba = new Cao("Goiaba", "Golden");
        Cao bisteca = new Cao("Bisteca", "Labrador");
        Cao melancia = new Cao("Melancia", "Pitbull");

        bisteca.ladrar();
        goiaba.ladrar();
        melancia.ladrar();

        melancia.setLatir("Woof Woof");

    }
}