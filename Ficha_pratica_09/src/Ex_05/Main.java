package Ex_05;

import Ex_02.Cao;

public class Main {
    public static void main(String[] args) {

        //Crie uma classe chamada "Carro" com os seguintes atributos: marca, modelo e ano de fabrico.
        //a. Crie um método na classe "Carro" chamado "ligar" que imprime a mensagem "O carro está ligado".
        //b. Crie um objeto da classe "Carro" e invoque o método "ligar

        // Instanciar Carro
        Carro carro_01 = new Carro("Mercedes", "C220",2019);

        System.out.println(carro_01.getMarca()+" | "+carro_01.getModelo()+" | "+carro_01.getAnoFabrico());
        carro_01.ligar();


    }
}