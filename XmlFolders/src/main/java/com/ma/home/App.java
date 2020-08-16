package com.ma.home;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Hello world!
 *
 */
public class App {
    public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        javax.xml.parsers.DocumentBuilder builder = factory.newDocumentBuilder();
        ByteArrayInputStream bf = new ByteArrayInputStream(xml.getBytes());
        Collection<String> list = new ArrayList<String>();
        NodeList elem = builder.parse(bf).getElementsByTagName("folder");

        for (int i=0; i<elem.getLength(); ++i)
        {
            Node node = elem.item(i).getAttributes().getNamedItem("name");
            if (node != null)
            {
                String folderName = node.getNodeValue();

                if (folderName.charAt(0) == startingLetter)
                {
                    list.add(folderName);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                        "<folder name=\"c\">" +
                        "<folder name=\"program files\">" +
                        "<folder name=\"uninstall information\" />" +
                        "</folder>" +
                        "<folder name=\"users\" />" +
                        "<folder name=\"uuusers test\" />" +
                        "</folder>";

        Collection<String> names = folderNames(xml, 'u');
        for(String name: names)
            System.out.println(name);
    }
}