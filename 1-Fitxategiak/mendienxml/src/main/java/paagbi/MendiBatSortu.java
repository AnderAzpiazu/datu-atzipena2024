package paagbi;

import java.util.ArrayList;
import java.util.List;

import paagbi.Model.Mendia;
import paagbi.Model.XmlManager;

public class MendiBatSortu {
    public static void main(String[] args) {
       
        Mendia mendia1 = new Mendia("San Anton", 500, "Gipuzkoa");

        List<Mendia> montes = new ArrayList<>();
        montes.add(mendia1);

        
        System.out.println("Mendia: " + mendia1.getIzena() + ", Altuera: " + mendia1.getAltuera() + " m, Probintzia: " + mendia1.getProbintzia());


        XmlManager.createMountainXmlFile(montes, "mendibat");
    }
}
