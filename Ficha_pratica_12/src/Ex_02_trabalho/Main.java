package Ex_02_trabalho;


import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        // Tipo de veiculo
        int opcaoveiculo =0;

        System.out.println("1. CARRO");
        System.out.println("2. CAMIAO");
        System.out.println("3. MOTA");
        System.out.print("Insira o tipo de veiculo que deseja construir: ");
        opcaoveiculo = input.nextInt();

        switch (opcaoveiculo) {
            case 1:
                System.out.println("\n*** Construtor de Carro ***");
                // Marca
                System.out.print("Marca: ");
                String marca = input.nextLine();

                // Modelo
                System.out.print("Modelo: ");
                String modelo = input.nextLine();

                // AnoFabrico
                System.out.print("Ano de Fabrico: ");
                int anoFabrico = input.nextInt();

                // Potencia
                System.out.print("Potencia: ");
                int potencia = input.nextInt();

                // Cilindrada
                System.out.print("Cilindrada: ");
                int cilindrada = input.nextInt();

                // Tipo de combustivel
                int opcao =0;
                TipoCombustivel combustivel=null;
                System.out.println("1. GASOLINA");
                System.out.println("2. DIESEL");
                System.out.println("3. GPL");
                System.out.println("4. ELETRICO");
                System.out.print("Insira o tipo de combustivel: ");
                opcao = input.nextInt();

                switch (opcao) {
                    case 1:
                        combustivel= TipoCombustivel.GASOLINA;
                        break;
                    case 2:
                        combustivel= TipoCombustivel.DIESEL;
                        break;
                    case 3:
                        combustivel= TipoCombustivel.GPL;
                        break;
                    case 4:
                        combustivel= TipoCombustivel.ELETRICO;
                        break;
                    default:
                        System.out.println("\nOpção inválida!");
                }

                // Consumo
                System.out.print("Consumo: ");
                double consumo = input.nextInt();

                // Qtd passageiros
                System.out.print("Quantidade de passageiros: ");
                int quantidadePassageiros = input.nextInt();
                Carro veiculoNovo = new Carro(marca,modelo,anoFabrico,potencia,cilindrada,combustivel,consumo,quantidadePassageiros);
                veiculoNovo.exibirDetalhes();

                // Calcular consumo
                System.out.print("\nInsira distancia para calcular consumo da viagem: ");
                double distancia2= input.nextDouble();
                veiculoNovo.calcularConsumo(distancia2);
                break;
            case 2:
                System.out.println("\n*** Construtor de Camiao ***");
                // Marca
                System.out.print("Marca: ");
                String marcaCamiao = input.nextLine();

                // Modelo
                System.out.print("Modelo: ");
                String modeloCamiao = input.nextLine();

                // AnoFabrico
                System.out.print("Ano de Fabrico: ");
                int anoFabricoCamiao = input.nextInt();

                // Potencia
                System.out.print("Potencia: ");
                int potenciaCamiao = input.nextInt();

                // Cilindrada
                System.out.print("Cilindrada: ");
                int cilindradaCamiao = input.nextInt();

                // Consumo
                System.out.print("Consumo: ");
                double consumoCamiao = input.nextInt();

                // Qtd passageiros
                System.out.print("Capacidade de carga: ");
                double capacidadeCarga = input.nextDouble();

                Camiao camiaoNovo = new Camiao(marcaCamiao,modeloCamiao,anoFabricoCamiao,potenciaCamiao,cilindradaCamiao,consumoCamiao,capacidadeCarga);
                camiaoNovo.exibirDetalhes();

                // Calcular consumo
                System.out.print("\nInsira distancia para calcular consumo da viagem: ");
                double distancia1= input.nextDouble();
                camiaoNovo.calcularConsumo(distancia1);

                break;
            case 3:
                System.out.println("\n*** Construtor de Mota ***");
                // Marca
                System.out.print("Marca: ");
                String marcaMota = input.nextLine();

                // Modelo
                System.out.print("Modelo: ");
                String modeloMota = input.nextLine();

                // AnoFabrico
                System.out.print("Ano de Fabrico: ");
                int anoFabricoMota = input.nextInt();

                // Potencia
                System.out.print("Potencia: ");
                int potenciaMota = input.nextInt();

                // Cilindrada
                System.out.print("Cilindrada: ");
                int cilindradaMota = input.nextInt();

                // Tipo de combustivel
                int opcao1 =0;
                TipoCombustivel combustivelMota=null;
                System.out.println("1. GASOLINA");
                System.out.println("2. DIESEL");
                System.out.println("3. GPL");
                System.out.println("4. ELETRICO");
                System.out.print("Insira o tipo de combustivel: ");
                opcao1 = input.nextInt();

                switch (opcao1) {
                    case 1:
                        combustivelMota= TipoCombustivel.GASOLINA;
                        break;
                    case 2:
                        combustivelMota= TipoCombustivel.DIESEL;
                        break;
                    case 3:
                        combustivelMota= TipoCombustivel.GPL;
                        break;
                    case 4:
                        combustivelMota= TipoCombustivel.ELETRICO;
                        break;
                    default:
                        System.out.println("\nOpção inválida!");
                }

                // Consumo
                System.out.print("Consumo: ");
                double consumoMota= input.nextInt();

                Mota motaNovo = new Mota(marcaMota,modeloMota,anoFabricoMota,potenciaMota,cilindradaMota,combustivelMota,consumoMota);
                motaNovo.exibirDetalhes();

                // Calcular consumo
                System.out.print("\nInsira distancia para calcular consumo da viagem: ");
                double distancia= input.nextDouble();
                motaNovo.calcularConsumo(distancia);
                break;

            default:
                System.out.println("\nOpção inválida!");
        }


    }



}

