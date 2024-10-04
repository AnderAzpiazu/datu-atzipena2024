package paagbi;

import java.util.ArrayList;
import java.util.List;

import paagbi.Model.Mendia;
import paagbi.Model.XmlManager;
import paagbi.Model.Base.Mendiak;

public class HiruMendiSortu {
    public static void main(String[] args) {
       
        Mendia mendia1 = new Mendia("Gorbeia", 1481, "Araba");
        Mendia mendia2 = new Mendia("Aizkorri", 1551, "Gipuzkoa");
        Mendia mendia3 = new Mendia("Txindoki", 1346, "Gipuzkoa");

        List<Mendia> montes = new ArrayList<>();
        montes.add(mendia1);
        montes.add(mendia2);
        montes.add(mendia3);

        Mendiak mendiak = new Mendiak(montes);

        for (Mendia monte : mendiak.getMendiZerrenda()) {
            System.out.println("Mendia: " + monte.getIzena() + ", Altuera: " + monte.getAltuera() + " m, Probintzia: " + monte.getProbintzia());
        }

        XmlManager.createMountainXmlFile(montes, "hirumendi");
    }
}
