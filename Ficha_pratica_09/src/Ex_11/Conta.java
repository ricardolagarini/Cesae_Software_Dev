package Ex_11;

public class Conta {

    private String titular_conta;
    private int numero_conta;
    private double saldo;


    public Conta(String titular_conta, int numero_conta, double saldo) {
        this.titular_conta = titular_conta;
        this.numero_conta = numero_conta;
        this.saldo = saldo;
    }

    public void depositar(int dinheiro){
        this.saldo+=dinheiro;
    }

    public void levantar(double dinheiro) {
        if (this.saldo >= dinheiro) {
            this.saldo -= dinheiro;

        } else {
            System.out.println("Não existe saldo suficiente para a operação.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Conta: "+this.numero_conta+" |Titular: "+this.titular_conta+" |Saldo: "+this.saldo+" EUR");
    }


    public void transferencia(double dinheiro,Conta destino) {

        if (this.saldo >= dinheiro) {
            this.saldo -= dinheiro;
            destino.saldo += dinheiro;
        } else {
            System.out.println("Não existe saldo suficiente para a operação.");
        }
    }




}
