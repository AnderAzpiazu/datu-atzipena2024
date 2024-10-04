package paagbi;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import paagbi.Model.Mendia;
import paagbi.Model.XmlManager;

public class CsvToXml {
    public static void main(String[] args) {
        String csvFile = "src\\main\\resources\\Mendiak.csv";
        String line;
        boolean firstLine = true;
        List<Mendia> mendiZerrenda = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] data = line.split(";");
                String izena = data[0];
                Double altuera = Double.parseDouble(data[1]);
                String probintzia = data[2];

                Mendia mendia = new Mendia(izena, altuera, probintzia);
                mendiZerrenda.add(mendia);
            }
            //IMPORTANTE
            XmlManager.createMountainXmlFile(mendiZerrenda, "Mendiak");

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    } 
}
