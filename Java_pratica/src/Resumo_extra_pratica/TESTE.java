package Resumo_extra_pratica;

        import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;

public class TESTE {
    private static final String SENHA_ADMIN = "123"; // Defina a senha de administrador à sua escolha

    private static Map<String, Cliente> clientes = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pergunta sobre o tipo de utilizador
        System.out.print("Digite o tipo de utilizador (ADMIN ou CLIENTE): ");
        String tipoUtilizador = scanner.nextLine().toUpperCase();

        if (tipoUtilizador.equals("ADMIN")) {
            System.out.print("Digite a senha de administrador: ");
            String senhaAdmin = scanner.nextLine();

            if (senhaAdmin.equals(SENHA_ADMIN)) {
                menuAdmin();
            } else {
                System.out.println("Senha de administrador incorreta. Encerrando o programa.");
            }
        } else if (tipoUtilizador.equals("CLIENTE")) {
            menuCliente();
        } else {
            System.out.println("Tipo de utilizador inválido. Encerrando o programa.");
        }

        scanner.close();
    }

    private static void menuAdmin() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMENU ADMIN");
            System.out.println("1. Imprimir conteúdo na consola");
            System.out.println("2. Imprimir quantas vendas foram executadas e o seu valor total");
            System.out.println("3. Calcular o total de lucro");
            System.out.println("4. Imprimir informações de um cliente pelo idCliente");
            System.out.println("5. Imprimir o jogo mais caro e os clientes que o compraram");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Implemente a lógica para imprimir o conteúdo
                    System.out.println("Opção 1: Imprimir conteúdo na consola");
                    break;
                case 2:
                    // Implemente a lógica para imprimir vendas e valor total
                    System.out.println("Opção 2: Imprimir vendas e valor total");
                    break;
                case 3:
                    // Implemente a lógica para calcular o total de lucro
                    System.out.println("Opção 3: Calcular total de lucro");
                    break;
                case 4:
                    // Implemente a lógica para imprimir informações de um cliente
                    System.out.println("Opção 4: Imprimir informações de um cliente");
                    break;
                case 5:
                    // Implemente a lógica para imprimir o jogo mais caro e clientes que o compraram
                    System.out.println("Opção 5: Imprimir jogo mais caro e clientes que o compraram");
                    break;
                case 0:
                    System.out.println("Saindo do MENU ADMIN.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static void menuCliente() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMENU CLIENTE");
            System.out.println("1. Simular registar cliente");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    simularRegistarCliente(scanner);
                    break;
                case 0:
                    System.out.println("Saindo do MENU CLIENTE.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static void simularRegistarCliente(Scanner scanner) {
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o contacto do cliente: ");
        String contacto = scanner.nextLine();
        System.out.print("Digite o email do cliente: ");
        String email = scanner.nextLine();

        Cliente novoCliente = new Cliente(nomeCliente, contacto, email);
        //clientes.put(novoCliente.getIdCliente(), novoCliente);

        System.out.println("Cliente inserido com sucesso!");
    }

    // Classe Cliente
    private static class Cliente {
        private static int contadorClientes = 0;

        private String idCliente;
        private String nomeCliente;
        private String contacto;
        private String email;

        public Cliente(String nomeCliente, String contacto, String email) {
            this.nomeCliente = nomeCliente;
            this.contacto = contacto;
        }
    }
}