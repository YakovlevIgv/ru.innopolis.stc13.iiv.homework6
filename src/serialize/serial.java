package serialize;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import javax.swing.text.StringContent;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Необходимо разработать класс, реализующий следующий интерфейс:
 *
 * void serialize (Object object, String file);
 *
 * Object deSerialize(String file);
 *
 * Методы выполняют сериализацию объекта Object в файл file и десериализацию объекта из этого файла.
 *
 * Обязательна сериализация и десериализация "плоских" объектов (все поля объекта - примитивы, или String).
 *
 * Задание "Под звездочкой": работать c любыми типами полей (полями могут быть ссылочные типы).
 */


public class serial {

    private serial(Object object, String file) {
    }

    ;

    public static void serialize(Object object, String file_p) throws IOException {

        Class class_for_serials = object.getClass();

        Document doc = new Document();
        Element classNameNode = new Element(class_for_serials.getName());
        doc.setRootElement(classNameNode);

        Field[] fields = class_for_serials.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Element objectFieldNode = new Element(field.getName());
                objectFieldNode.setAttribute("type", field.getType().getName()).setAttribute("value", field.get(object).toString());
                classNameNode.addContent(objectFieldNode);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        XMLOutputter outputter = new XMLOutputter();
        outputter.setFormat(Format.getPrettyFormat());
        outputter.output(doc, new FileWriter(file_p));
    }


    public static Object deSerialize(String file_p) throws IllegalAccessException, NoSuchFieldException, InstantiationException, JDOMException, IOException, ClassNotFoundException {
        Object object = null;
        /**
         *
         */
        return object;
    }
}








