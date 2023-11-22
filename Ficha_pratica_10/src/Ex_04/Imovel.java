package Ex_04;

public class Imovel {

   private String rua;
   private int numPorta;
   private String cidade;
   private TipoImovel tipoImovel;
   private TipoAcabamento acabamento;
   private double area;
   private int numQuarto;
   private int numCasaBanho;
   private double areaPiscina;


    public Imovel(String rua, int numPorta, String cidade, TipoImovel tipoImovel, TipoAcabamento acabamento, double area, int numQuarto, int numCasaBanho, double areaPiscina) {
        this.rua = rua;
        this.numPorta = numPorta;
        this.cidade = cidade;
        this.tipoImovel = tipoImovel;
        this.acabamento = acabamento;
        this.area = area;
        this.numQuarto = numQuarto;
        this.numCasaBanho = numCasaBanho;
        this.areaPiscina = areaPiscina;
    }

    public void calcularImovel() {
        double valorTipo=0,valorAcab=0;
        if (this.tipoImovel.equals(TipoImovel.Casa)) {
          valorTipo = this.area * 3000;
        }
        if (this.tipoImovel.equals(TipoImovel.Apartamento)) {
            valorTipo = this.area * 1000;
        }
        if (this.tipoImovel.equals(TipoImovel.Mansao)) {
            valorTipo = this.area * 5000;
        }
        if (this.acabamento.equals(TipoAcabamento.Nova)) {
            valorAcab = 1;
        }
        if (this.acabamento.equals(TipoAcabamento.Usada)) {
            valorAcab = 0.90;
        }
        if (this.acabamento.equals(TipoAcabamento.Restauro)) {
            valorAcab = 0.50;
        }
        if (this.acabamento.equals(TipoAcabamento.Nova_Com_Alto_Acabamento)) {
            valorAcab = 1.25;
        }
        double valorQuarto=this.numQuarto*7500;
        double valorCasaBanho=this.numCasaBanho*10500;
        double valorPiscina= this.areaPiscina*1000;
        double valorTotalImovel;
        valorTotalImovel = (valorPiscina+valorCasaBanho+valorQuarto+valorTipo)*(valorAcab);

        System.out.println("valor do imovel é " + valorTotalImovel+" EUR");

    }



    public void imprmirDescricao() {
        System.out.print("********************************************");
        System.out.println("\nRua: "+this.rua);
        System.out.println("Numero da porta: "+this.numPorta);
        System.out.println("Cidade: "+this.cidade);
        System.out.println("Tipo: "+this.tipoImovel);
        System.out.println("Acabamento: "+this.acabamento);
        System.out.println("Area do imovel: "+this.area+" m²");
        System.out.println("Numero de quartos: "+this.numQuarto);
        System.out.println("Numero de casas de banho: "+this.numCasaBanho);
        System.out.println("Area da piscina: "+this.areaPiscina+" m²");

    }



    public void compararImoveis(Imovel imovelComparado) {


    }





}
