package paagbi.Model;

import java.io.File;
import java.util.List;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import paagbi.Model.Base.Mendiak;

public class XmlManager {
    public static void createMountainXmlFile(List<Mendia> mendiaList, String file) {
        Mendiak mendiak = new Mendiak(mendiaList);

        try {
            Marshaller marshaller = marshallerConfiguration(Mendiak.class);
            marshaller.marshal(mendiak, new File("src\\main\\resources\\"+file+".xml"));
            marshaller.marshal(mendiak, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static Mendiak UnMarshallMountainXmlFile(String file) {
        Unmarshaller unmarshaller = unmMrshallerConfiguration(Mendiak.class);
        try {
            Mendiak mendiak = (Mendiak) unmarshaller.unmarshal(new File("src\\main\\resources\\"+file+".xml"));
            return mendiak;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @SuppressWarnings("rawtypes")
    private static Marshaller marshallerConfiguration(Class c) {
        try {
            JAXBContext context = JAXBContext.newInstance(c);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            return marshaller;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    @SuppressWarnings("rawtypes")
    private static Unmarshaller unmMrshallerConfiguration(Class c) {
        try {
            JAXBContext context = JAXBContext.newInstance(Mendiak.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return unmarshaller;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
