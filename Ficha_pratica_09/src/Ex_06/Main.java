package Ex_06;

import Ex_06.Calculadora;

public class Main {
    public static void main(String[] args) {

        //Crie uma classe sem atributos chamada "Calculadora".
        //a. Elabore métodos para adição, subtração, multiplicação e divisão (Estes métodos devem receber
        //dois números reais como argumentos e, no final, apresentar na consola o resultado).
        //b. Crie um objeto dessa classe e use os métodos para realizar algumas operações matemáticas (deve
        //realizar, pelo menos, uma de cada)


        Calculadora calculo = new Calculadora(50,5);

        calculo.somar();
        calculo.subtrair();
        calculo.multiplicar();
        calculo.dividir();

    }
}