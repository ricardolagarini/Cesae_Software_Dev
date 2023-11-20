package Ex_08;

import Ex_08.Aluno;

public class Main {
    public static void main(String[] args) {

        //Crie uma classe Aluno que tenha os atributos nome, idade, curso e média.
        //a. Crie um construtor que receba os quatro atributos como parâmetros.
        //b. Crie um método chamado situacao que retorne "Aprovado" se a média for maior ou igual a 9.5, "Reprovado" caso contrário.
        //c. No método main, crie um objeto dessa classe e apresente a situação do aluno

        Aluno roberto = new Aluno("Roberto", 18, "Programação", 8);
        Aluno joao = new Aluno("João", 19, "Medicina", 10);
        Aluno luis = new Aluno("Luis", 18, "Matematica", 9.5);

        roberto.situacaoAluno();
        joao.situacaoAluno();
        luis.situacaoAluno();

    }
}
