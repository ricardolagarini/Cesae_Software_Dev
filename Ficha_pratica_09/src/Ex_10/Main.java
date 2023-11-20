package Ex_10;

public class Main {
    public static void main(String[] args) {

        //. Crie uma classe Funcionário que tenha os atributos nome, salário e departamento, e os métodos
        //aumentarSalario e exibirDados.

        //a. O método aumentarSalario deve receber um valor percentual (número real) como parâmetro e atualizar o salário de acordo.
        //b. O método exibirDados deve exibir na consola o nome, salário e departamento do funcionário.

        //c. No método main, crie um objeto dessa classe e invoque os métodos para aumentar o salário em 10% e exibir os dados do funcionário

        Funcionario roberto = new Funcionario("Roberto", 1400, "Fiscal");

        roberto.exibirDados();
        roberto.aumentarSalario();
        roberto.exibirDados();

    }
}
