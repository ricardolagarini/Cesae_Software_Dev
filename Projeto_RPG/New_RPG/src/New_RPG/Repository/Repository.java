package New_RPG.Repository;

import New_RPG.Itens.ItemHeroi;
import New_RPG.Tools.CsvReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Repository {
    private ArrayList<ItemHeroi> itensList;

    public Repository(String filePath) throws FileNotFoundException {
        CsvReader csvListReader = new CsvReader(filePath);
        this.itensList = csvListReader.readCSVToRepository();
    }

}
