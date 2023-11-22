package Ex_04;

public class Main {
    public static void main(String[] args) {


        Imovel imovel1 = new Imovel("Rua pastel de nata",58,"Porto",TipoImovel.Apartamento,TipoAcabamento.Usada,150,2,1,50);
        Imovel imovel2 = new Imovel("Rua da francesinha",15,"Porto",TipoImovel.Casa,TipoAcabamento.Nova,120,3,2,90);
        Imovel imovel3 = new Imovel("Rua da lasanhada",30,"Porto",TipoImovel.Mansao,TipoAcabamento.Nova_Com_Alto_Acabamento,300,6,4,200);

        imovel1.calcularImovel();
        imovel2.calcularImovel();
        imovel3.calcularImovel();

        imovel1.imprmirDescricao();
        imovel2.imprmirDescricao();
        imovel3.imprmirDescricao();

    }
}
