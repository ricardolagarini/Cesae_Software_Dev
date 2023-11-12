package Resumo_extra_pratica;

import java.util.Scanner;

public class contador_while {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limite, salto, cont=0;

        System.out.print("insira um limite:");
        limite = input.nextInt();

        System.out.print("insira um salto:");
        salto = input.nextInt();

        while (cont <= limite) {
            System.out.println(+cont);
            cont= cont + salto;
        }
    }
}