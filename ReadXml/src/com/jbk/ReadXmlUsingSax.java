package com.jbk;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ReadXmlUsingSax extends DefaultHandler  {
	boolean bfname = false, blname = false, bmarks = false;

	public static void main(String[] args) throws ParserConfigurationException, SAXException {

		SAXParserFactory fact = SAXParserFactory.newInstance();
		SAXParser saxparser = fact.newSAXParser();
		DefaultHandler handle = new DefaultHandler();
		

	}
	//SAXParser.parse("student.xml",handle);
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("Start Element : " + qName);
		if (qName.equals("firstname"))
			bfname = true;
		if (qName.equals("laststname"))
			blname = true;
		if (qName.equals("marks"))
			bmarks = true;
		super.startElement(uri, localName, qName, attributes);
	}@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("Start Element : " + qName);
		super.endElement(uri, localName, qName);
	}@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if (bfname) {
			System.out.println("First Name : " + new String(ch, start, length));
			bfname = false;
		}
		if (blname) {
			System.out.println("Last Name : " + new String(ch, start, length));
			blname = false;
		}
		if (bmarks) {
			System.out.println("Marks : " + new String(ch, start, length));
			bmarks = false;
		}
		super.characters(ch, start, length);
	}

}
