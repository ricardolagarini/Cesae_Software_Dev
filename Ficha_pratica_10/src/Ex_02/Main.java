package Ex_02;

import Ex_02.Conta;
public class Main {
    public static void main(String[] args) {

    Conta conta_01 = new Conta("Alex", 101);

    conta_01.depositar(560);
    conta_01.mostrarSaldo();
    conta_01.pedirEmprestimo(300);
    conta_01.mostrarSaldo();
    conta_01.pedirEmprestimo(400);

    }

}