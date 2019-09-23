/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modifyxmlfile;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/**
 *
 * @author User
 */
public class CpoyMain {
    public void updateXml(){
        try {
            File filePath = new File("E:\\1248515\\advanceJava\\ModifyXMLFile\\src\\modifyxmlfile\\Simples.xml");
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder =  docFactory.newDocumentBuilder();
            Document doc =  docBuilder.parse(filePath);
            Node staff = doc.getElementsByTagName("staff").item(0);
            System.out.println("Stafftag  " + staff.getNodeName());
            NamedNodeMap  attr = staff.getAttributes();
            Node id = attr.getNamedItem("id");
            id.setTextContent("3");
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(filePath);
                transformer.transform(source, result);
                System.out.println("done");
        } catch (Exception e) {
            
        }
        
    }
    
}
