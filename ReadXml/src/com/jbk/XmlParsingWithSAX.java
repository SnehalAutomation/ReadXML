package com.jbk;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XmlParsingWithSAX extends DefaultHandler {

	@Override
	public void startDocument() throws SAXException {
		System.out.println("Begin parsing document.....");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("\n end parsing document.....");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("<"+qName+">");
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("<"+qName+">");
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
	
		for(int i = start;i<(start +length);i++) {
			
		}
	}

}
