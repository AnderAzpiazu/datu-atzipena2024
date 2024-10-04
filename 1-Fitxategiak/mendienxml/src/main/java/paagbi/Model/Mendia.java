package paagbi.Model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Mendia {
    private String izena;
    private double altuera;
    private String probintzia;

    public Mendia() {}

    public Mendia(String izena, double altuera, String probintzia) {
        this.izena = izena;
        this.altuera = altuera;
        this.probintzia = probintzia;
    }

    @XmlElement (name = "Izena")
    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    @XmlElement (name = "Altuera")
    public double getAltuera() {
        return altuera;
    }

    public void setAltuera(double altuera) {
        this.altuera = altuera;
    }

    @XmlElement (name = "Probintzia")
    public String getProbintzia() {
        return probintzia;
    }

    public void setProbintzia(String probintzia) {
        this.probintzia = probintzia;
    }
}
