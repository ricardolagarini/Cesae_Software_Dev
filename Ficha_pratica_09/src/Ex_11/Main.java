package Ex_11;

import Ex_09.Produto;

public class Main {
    public static void main(String[] args) {

        //Crie um programa para fazer a gestão de contas bancárias:
        //• Crie uma classe chamada "Conta" com os seguintes atributos: número da conta, saldo e titular da conta.

        //• Crie um método “transferência” que tenha como parâmetros o valor a transferir e a conta de destinatário.
        //• Crie os métodos depositar (aumentar saldo), levantar (diminuir saldo) e mostrarSaldo. (Exemplo
        //de mostarSaldo: “Saldo da conta 12345: 950 EUR”)

        //• O método depositar deve receber um valor como parâmetro e atualizar o saldo.
        //• O método levantar deve receber um valor como parâmetro e verificar se é possível realizar a
        //operação, considerando o saldo. De seguida, atualiza o saldo se a transação for possível.
        //• O método exibirSaldo deve exibir na consola o saldo atual da conta.

        //• No método main, crie um objeto da classe Conta e invoque os métodos para depositar 1000€ e exibir o saldo.
        //• De seguida, invoque o método para levantar 120€ e exiba o saldo.
        //• De seguida, crie mais dois objetos da classe e atribua valores aos seus atributos. De seguida,
        //transfira um valor de uma conta para a outra.
        //• No fim, deve exibir o saldo atual das três contas

        Conta conta_01 = new Conta("Alex", 101,0);
        Conta conta_02 = new Conta("Maria", 205,0);


        conta_01.mostrarSaldo();
        conta_01.depositar(1000);
        conta_01.mostrarSaldo();
        conta_01.levantar(120);
        conta_01.mostrarSaldo();
        conta_01.transferencia(350,conta_02);
        conta_01.mostrarSaldo();
        conta_02.mostrarSaldo();
        conta_01.transferencia(1050,conta_02);

    }
}
