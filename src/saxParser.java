import java.io.File;
import java.io.IOException;
import java.util.*;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class saxParser {
    static Map<String,String> tmpAtrb=null;
    static Map<String,String> xmlVal= new LinkedHashMap<String, String>();
    static List<Currencies> currenciesList = new ArrayList<Currencies>();
    public static void ReadXML() throws ParserConfigurationException, SAXException, IOException, VerifyError {

        SAXParserFactory saxDoc = SAXParserFactory.newInstance();
        SAXParser saxParser = saxDoc.newSAXParser();

        DefaultHandler handler = new DefaultHandler() {
            String tmpElementName = null;
            String tmpElementValue = null;


            @Override
            public void startElement(String uri, String localName, String qName,
                                     Attributes attributes) throws SAXException {
                tmpElementValue = "";
                tmpElementName = qName;
                tmpAtrb=new HashMap();
                for (int i=0; i<attributes.getLength(); i++) {
                    String aname = attributes.getLocalName(i);
                    String value = attributes.getValue(i);
                    tmpAtrb.put(aname, value);
                }
            }

            @Override
            public void endElement(String uri, String localName, String qName)
                    throws SAXException {

                if(tmpElementName.equals(qName)){
                    if(tmpElementName.equals("Cube")){
                        float rate = 0;
                        String currency = "";

                        for (Map.Entry<String, String> entrySet : tmpAtrb.entrySet()) {
                            switch (entrySet.getKey()){
                                case "rate":
                                    rate = Float.parseFloat(entrySet.getValue());
                                    break;
                                case "currency":
                                    currency=entrySet.getValue();
                                    break;
                            }
                        }
                        currenciesList.add(new Currencies(rate,currency));
                    }
                    xmlVal.put(tmpElementName, tmpElementValue);
                }
            }
            @Override
            public void characters(char ch[], int start, int length) throws SAXException {
                tmpElementValue = new String(ch, start, length) ;
            }
        };
        saxParser.parse(new File("eurofxref-daily.xml"), handler);
    }
}