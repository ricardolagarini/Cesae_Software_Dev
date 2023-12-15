package Controllers;

import Domain.Venda;
import Repository.VendasRepository;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AdminController {

    private ArrayList<Venda> vendaTotal;

    public AdminController() throws FileNotFoundException {
        VendasRepository repository = new VendasRepository("Ficheiros/minimercado.csv");
        this.vendaTotal = repository.getVendaArray();
    }

    public double valorVendaTotal() {
        double somaVendas=0;
        for (Venda vendaAtual : this.vendaTotal) {
            somaVendas+=vendaAtual.getPrecoUnitario();
        }
        return  somaVendas;
    }

    public double mediaVendas() {
        double media=0;
        double total= this.valorVendaTotal();

        media= total/vendaTotal.size();
        return  media;
    }



}
