package principal;
import XmlEncoder.XMLEncodeDecode;
import source.DVD;
import source.Movie;
public class Principal {
    public static void main(String[] args) {
       Movie bourneTridentity = new Movie("The Bourne Identity", 119,
               "Doung Liman ", 2002, "Matt Damon, Franka potente");
        Movie bourneSupermacy = new Movie("The Bourne supermacy", 108,
                "paul Greengrass ", 2004, "Matt Damon, Franka potente, Joan Allen");
        Movie bourneUltimatum = new Movie("The Bourne ultimatum", 115,
                " paul Greengrass", 2007, "Matt Damon, Edgar Ramirez, Joan Allen");

        DVD bourneseries = new DVD();
        bourneseries.add(bourneTridentity);
        bourneseries.add(bourneSupermacy);
        bourneseries.add(bourneUltimatum);

        XMLEncodeDecode encodedecode = new XMLEncodeDecode();
        encodedecode.encode(bourneseries, "DVD.xml");

        DVD extraccion = (DVD)encodedecode.decode("DVD.xml");
        System.out.println(extraccion);
    }
}
