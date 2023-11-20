package Ex_07;

import Ex_07.Livro;

public class Main {
    public static void main(String[] args) {

        //Crie uma classe chamada "Livro" com os seguintes atributos: título, autor, categoria, número de páginas e ISBN.
        //Em seguida, crie um método na classe "Livro" chamado "exibirDetalhes" que imprime na consola
        //todos os atributos do livro. De seguida, crie dois objetos da classe "Livro" e invoque o método
        //"exibirDetalhes" para cada um deles.

        Livro livro_01 = new Livro("Algoritimia", "Elon Musk", "Programação", 250, "ISBN-20");
        Livro livro_02 = new Livro("As melhores receceitas de francesinha", "Bill Gates", "Culinária", 80, "ISBN-13");
        Livro livro_03 = new Livro("Hipertrofia ao máximo", "Prozis", "Desporto", 55, "ISBN-99");

        livro_01.exibirDetalhes();
        livro_02.exibirDetalhes();
        livro_03.exibirDetalhes();
    }
}
