
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class SaxParserPratice {
    
    public static void main(String[] args) throws SAXException,ParserConfigurationException, IOException{
      
//            try {
//                InputStream inputFile = new FileInputStream("E:\\1248515\\advanceJava\\SaxParserPractice\\src\\Simple.xml");
//                SAXParserFactory factory = SAXParserFactory.newInstance();
//                SAXParser saxParser = factory.newSAXParser();
//                AnotherHandler handler = new AnotherHandler();
//                saxParser.parse(inputFile,handler);
//                
//            } catch (FileNotFoundException ex) {
//                System.out.println(ex);
//        
//        
//    }
                domeParserTest();
    }
   public static void domeParserTest() throws ParserConfigurationException, SAXException, IOException{
       DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
       DocumentBuilder builder = factory.newDocumentBuilder();
       File file = new File("E:\\1248515\\advanceJava\\SaxParserPractice\\src\\Simple.xml");
        org.w3c.dom.Document doc =  builder.parse(file);
        System.out.println(doc.getDocumentElement().getNodeName());
       NodeList nList = doc.getElementsByTagName("Student");
        for(int i =0;i<nList.getLength();i++){
            Node n = nList.item(i);
            System.out.println("Node "+n.getNodeName());
            Element e  = (Element) n;
            System.out.println("First Name "+e.getElementsByTagName("firstName").item(0).getTextContent());
            
            
        }
   }

    }

