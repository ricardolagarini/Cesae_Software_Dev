package Ex_02;

import Ex_01.Pessoa;

public class Main {
    public static void main(String[] args) {

        // Instanciar 3 caes
        Cao goiaba = new Cao("Goiaba", "Golden");
        Cao bisteca = new Cao("Bisteca", "Labrador");
        Cao melancia = new Cao("Melancia", "Pitbull");

        // Imprimir os detalhes do primeiro cao
        System.out.println("\nNome do cao: " + goiaba.getNome());
        System.out.println("Raça: " + goiaba.getRaca());
        System.out.println("Latido: " + goiaba.getLatido());

        // Imprimir os detalhes do segundo cao
        System.out.println("\nNome do cao: " + bisteca.getNome());
        System.out.println("Raça: " + bisteca.getRaca());
        System.out.println("Latido: " + bisteca.getLatido());


        // Mudar o latido do terceiro cao para woof
        melancia = new Cao("Melancia", "Pitbull");
        melancia.setLatir("Woof");

        // Imprimir os detalhes do terceiro cao
        System.out.println("\nNome do cao: " + melancia.getNome());
        System.out.println("Raça: " + melancia.getRaca());
        System.out.println("Latido: " + melancia.getLatido());


    }
}