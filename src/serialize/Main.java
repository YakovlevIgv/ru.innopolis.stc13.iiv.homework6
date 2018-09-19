package serialize;


import org.jdom2.JDOMException;

import java.io.IOException;

public class Main {
    private static final String file_puth= "C://Users//IIV//Documents//Tempserial.txt";

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, IOException, JDOMException, ClassNotFoundException, InstantiationException {

        //private new String("file_name");
        //void serialize(Object object, String file) {
        Capucin abou = new Capucin(50);

        //Class<Capucin> clazz = (Class<Capucin>) abou.getClass();

        //ReflectionUtils.printClass(clazz);
        serial.serialize(abou,"outputFile.xml");
        Capucin Cpushaaou= (Capucin) serial.deSerialize("outputFile.xml");


    }
}
