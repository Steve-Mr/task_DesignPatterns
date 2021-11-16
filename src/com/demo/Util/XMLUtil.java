package com.demo.Util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static Object getBean(String filePath) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder;
        try {
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document;
            document = documentBuilder.parse(new File(filePath));

            NodeList nodeList = document.getElementsByTagName("className");
            Node classNode = nodeList.item(0).getFirstChild();
            String className = classNode.getNodeValue();

            Class<?> c = Class.forName(className);
            return c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
