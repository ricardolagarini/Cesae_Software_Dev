package Ex_10;

public class Funcionario {

    private String nome;
    private double salario;
    private String departamento;


    public Funcionario(String nome, int salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }


    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }
    public String getDepartamento() {
        return departamento;
    }


    public void aumentarSalario(double porcentagemAumento) {
        this.salario = this.salario*(1+(porcentagemAumento/100));

    }

    public void exibirDados() {
        System.out.println("Nome: "+this.nome+" | "+"Departamento: "+this.departamento+" | "+"Salario: "+this.salario);
    }


}
