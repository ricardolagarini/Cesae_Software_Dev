package Ex_03;

public class Main {

    public static void main(String[] args) {


        Animal cao= new Animal("Joaquim","Cao","Portugal",30,new String[]{"carne","ração"});
        Animal macaco= new Animal("Tobias","Macaco","Africa",20,new String[]{"folhas","frutas"});

        cao.exibirDetalhes();
        macaco.exibirDetalhes();
        System.out.println("*****************");
        cao.comer("carne",100);
        macaco.comer("carne",100);
        System.out.println("*****************");
        cao.exibirDetalhes();
        macaco.exibirDetalhes();

    }

}
