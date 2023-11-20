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


    public void aumentarSalario() {
        double aumento = this.salario * 0.1;
        this.salario += aumento;
    }

    public void exibirDados() {
        System.out.println("Nome: "+this.nome+" | "+"Departamento: "+this.departamento+" | "+"Salario: "+this.salario);
    }


}
