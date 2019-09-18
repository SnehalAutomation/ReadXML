package com.jbk;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXmlFileUsingDOM {

	public static void main(String[] args) throws SAXException, IOException {
		try {
		File xmlDoc= new File("student.xml");
		DocumentBuilderFactory dbFact = DocumentBuilderFactory.newInstance();
		
			DocumentBuilder dBuild= dbFact.newDocumentBuilder();
			Document doc= dBuild.parse(xmlDoc);
			// Read root element
			System.out.println("Root element:" +doc.getDocumentElement().getNodeName());
			
			// read array of student elements
			// this array is called NodeList
			
			NodeList nList= doc.getElementsByTagName("student");
			for(int i=0; i<nList.getLength();i++) {
				Node nNode= 
				nList.item(i);
				System.out.println("Node name:" +nNode.getNodeName()+""+(i+1));
			if(nNode.getNodeType()== Node.ELEMENT_NODE) {
				Element eElement= (Element)nNode;
				System.out.println("Student ID : " +eElement.getAttribute("idno"));
				System.out.println("Student First Name : "+eElement.getElementsByTagName("firstname").item(0).getTextContent());
				System.out.println("Student Last Name : "+eElement.getElementsByTagName("lastname").item(0).getTextContent());
				System.out.println("Student Marks : "+eElement.getElementsByTagName("marks").item(0).getTextContent());
				
			}
			
			}
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		 
	}

}
