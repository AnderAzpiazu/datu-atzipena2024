package paagbi.Model.Base;

import java.util.List;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import paagbi.Model.Mendia;

@XmlRootElement
public class Mendiak {
    private List<Mendia> mendiZerrenda;

    public Mendiak() {}

    public Mendiak(List<Mendia> mendiZerrenda) {
        this.mendiZerrenda = mendiZerrenda;
    }

    @XmlElement (name = "Mendia")
    public List<Mendia> getMendiZerrenda() {
        return mendiZerrenda;
    }

    public void setMendiZerrenda(List<Mendia> mendiZerrenda) {
        this.mendiZerrenda = mendiZerrenda;
    }
}
