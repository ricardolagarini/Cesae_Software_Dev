package Ex_02;

public class Cao {

    //Crie três instâncias da classe "Cão", defina os seus atributos (nome e raça) usando o construtor
    //Definir atributos de instância
    private String nome;
    private String raca;
    private String latido= "Au Au Au";

    /**
     * Método construtor de Cao
     * @param nome Nome do Cao
     * @param raca Idade do Cao
     */
    public Cao(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return this.nome;
    }
    public String getRaca() {
        return this.raca;
    }
    public String getLatido() {
        return this.latido;
    }

    public void setLatir(String latido) {
        this.latido = latido;
        System.out.println(this.nome+" mudou latido para: "+latido);
    }

    public void ladrar(){
        System.out.println(this.nome +" ladra: "+latido);
    }


}
