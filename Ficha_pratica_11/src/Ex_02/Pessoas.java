package Ex_02;



public class Pessoas {

    private String nome;
    private int idade;
    private String email;
    private int telemovel;

    public Pessoas(String nome, int idade, String email, int telemovel) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telemovel = telemovel;
    }

    public int getIdade() {
        return this.idade;
    }
    public String getNome() {
        return this.nome;
    }


    public void exibirDetalhes(){
        System.out.println(this.nome+ " | "+this.idade+" anos | Telemovel: "+this.telemovel+" | Email: "+ this.email);
    }













}



