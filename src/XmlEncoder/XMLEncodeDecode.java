package XmlEncoder;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class XMLEncodeDecode {
    public void encode(Object object, String filename){
        XMLEncoder encoder = null;

        try{
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(filename)));
        } catch (FileNotFoundException e) {
            System.out.println("Error: al tratar de crear y abrir el archivo"+ filename);
        }
        encoder.writeObject(object);
        encoder.close();
    }

    public Object decode(String filename){
        XMLDecoder decoder = null;
        try{
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(filename)));

        } catch (FileNotFoundException e) {
            System.out.println("Error: al tratar de abrir el archivo "+ filename);
        }
        Object object = decoder.readObject();
        return object;
    }
}
