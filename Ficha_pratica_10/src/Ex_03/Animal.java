package Ex_03;

public class Animal {

    private String nome;
    private String especie;
    private String pais_origem;
    private double peso;
    private String[] alimentacao;


    public Animal(String nome, String especie, String pais_origem, double peso, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.pais_origem = pais_origem;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }

    public void comer(String alimento, double pesoRefeicao){
        for(int i=0;i<alimentacao.length;i++) {
            if (alimentacao[i].equals(alimento)){
                this.peso+= pesoRefeicao/1000;
                System.out.println("O "+this.especie+ " "+this.nome+" comeu "+alimento);
                return; // finaliza o ciclo
            }
        }
        System.out.println("O "+this.especie+ " "+this.nome+" não comeu "+alimento);
    }

    public void exibirDetalhes() {
        System.out.println("O "+this.especie+" "+this.nome+" pesa "+this.peso+" Kg");
    }








}
