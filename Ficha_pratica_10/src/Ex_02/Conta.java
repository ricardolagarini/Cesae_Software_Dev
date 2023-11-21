package Ex_02;

public class Conta {

    private String titular_conta;
    private int numero_conta;
    private double saldo=0;
    private double margem_emprestimo;
    private int ano_abertura=2023;
    private double valor_divida=0;

    public Conta(String titular_conta, int numero_conta) {
        this.titular_conta = titular_conta;
        this.numero_conta = numero_conta;
    }

    public void depositar(int valor){

        this.saldo+=valor;
    }

    public void levantar(double dinheiro) {
        if (this.saldo >= dinheiro) {
            this.saldo -= dinheiro;

        } else {
            System.out.println("Não existe saldo suficiente para a operação.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("\nConta: "+this.numero_conta);
        System.out.println("Titular: "+this.titular_conta);
        System.out.println("Saldo: "+this.saldo+" EUR");
    }

    public void transferencia(double dinheiro,Conta destino) {

        if (this.saldo >= dinheiro) {
            this.saldo -= dinheiro;
            destino.saldo += dinheiro;
        } else {
            System.out.println("Não existe saldo suficiente para a operação.");
        }
    }

    public void pedirEmprestimo(double valor) {
        margem_emprestimo=this.saldo*0.9;

        if (this.saldo > valor && margem_emprestimo>valor && this.valor_divida==0) {
            valor_divida=valor;
            this.saldo+=valor;
            System.out.println("\nValor de " +valor+ " EUR para empréstimo aprovado.");

        } else {
            System.out.println("\nPedido de empréstimo negado.");
        }

    }

}



