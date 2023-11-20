package Ex_06;

public class Calculadora {


    private double numero1;
    private double numero2;


    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }


    public double getNumero1() {
        return this.numero1;
    }

    public double getNumero2() {
        return this.numero2;
    }


    public void somar(){
        System.out.println("Resultado da soma: "+(this.numero1+this.numero2));
    }

    public void subtrair(){
        System.out.println("Resultado da subtração: "+(this.numero1-this.numero2));
    }

    public void multiplicar(){
        System.out.println("Resultado da multiplicação: "+(this.numero1*this.numero2));
    }

    public void dividir(){
        System.out.println("Resultado da divisão: "+(this.numero1/this.numero2));
    }

}




