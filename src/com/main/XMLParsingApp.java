
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLParsingApp
{
    public static void main(String[] args) {

        try {
            String filename = "security-rest-api-put.xml";
            File inputFile = new File(filename);

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            System.out.println("----------------------------");
            NodeList nList = doc.getElementsByTagName("filename");
            for (int temp = 0; temp < nList.getLength(); temp++)
            {
                String path = nList.item(temp).getParentNode().getParentNode().getAttributes().getNamedItem("path").getNodeValue();
                String regex = nList.item(temp).getAttributes().getNamedItem("regex").getNodeValue();
                if(regex.equals("XSS:throwerror"))
                {
                    System.out.println(path);
                }

//				Node thresholdNode = nList.item(temp).getAttributes().getNamedItem("threshold");
//				String threshold = "";
//				if(thresholdNode != null)
//				{
//					threshold = thresholdNode.getNodeValue();
//				}
//				Node durationNode = nList.item(temp).getAttributes().getNamedItem("duration");
//
//				String duration = "";
//				if(durationNode != null)
//				{
//					duration = durationNode.getNodeValue();
//				}
//				if(StringUtils.isEmpty(threshold))
//				{
//					System.out.println("Threshold unconfigured URL : "+ nList.item(temp).getAttributes().getNamedItem("path").getNodeValue());
//				}
//				if(StringUtils.isEmpty(duration))
//				{
//					System.out.println("Duration unconfigured URL : "+ nList.item(temp).getAttributes().getNamedItem("path").getNodeValue());
//				}

                //				List<String> keyList = new ArrayList<>(1000);
                //NodeList nNodeList = nList.item(temp).getChildNodes();
//				for(int temp2 = 0; temp2 < nNodeList.getLength() ; temp2 ++)
//				{
//					Node keyNode = nNodeList.item(temp2);
//					if(keyNode.getNodeName().equals("key"))
//					{
//						String keyName = keyNode.getAttributes().getNamedItem("name").getNodeValue();
//						if(keyName.equals("IAMArray"))
//						{
//							System.out.println("Template Name : " + nList.item(temp).getAttributes().getNamedItem("name").getNodeValue() + "  ---  Node Name : " + keyName);
//
//						}
//						if(keyList.contains(keyName))
//						{
//							System.out.println("Template Name : " + nList.item(temp).getAttributes().getNamedItem("name").getNodeValue() + "  ---  Node Name : " + keyName);
//						}
//						else
//						{
//							keyList.add(keyName);
//						}
//					}
//				}
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}