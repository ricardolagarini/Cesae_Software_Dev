package Ficha_pratica_01;

import java.util.Scanner;

public class ex_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double codigo, salario, diastrab, alimentacao, irs, ssoc, salliq;

        System.out.print("Qual o codigo de funcionário?: ");
        codigo=input.nextDouble();

        System.out.print("Quantos dias trabalhados?: ");
        diastrab=input.nextDouble();

        salario=(diastrab*40);
        alimentacao=(diastrab*5);
        irs=(salario*0.10);
        ssoc=(salario*0.11);
        salliq=(salario-irs-ssoc)+alimentacao;

        System.out.println("\nVencimento bruto: " + salario + "euros " );
        System.out.println("Subsidio de alimentação: " + alimentacao + "euros " );
        System.out.println("10% de IRS: " + irs + "euros " );
        System.out.println("11% de Segurança Social: " + ssoc + "euros " );
        System.out.println("\nValor total liquido a receber: " + salliq + "euros " );

    }



}
