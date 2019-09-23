
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class AnotherHandler extends DefaultHandler{

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
       // super.startElement(uri, localName, qName, attributes); //To change body of generated methods, choose Tools | Templates.
        System.out.println(qName);
    
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        //super.characters(ch, start, length); //To change body of generated methods, choose Tools | Templates.
        System.out.println(new String(ch,start, length));
    
    }

    @Override
    public void startDocument() throws SAXException {
       // super.startDocument(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Parsing Started");
    }
    
    
    
}
