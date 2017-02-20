package com.panand.java;
import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.*;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.*;
import java.io.*;
  
public class ParseTest{
  
	public static void main( String[] args )
	{
		System.out.println("test");
	  
		ParseTest test = new ParseTest();
		String fileName = "gps.xml";
		String tagFilter = "CRSNNL";
		  
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		Document document = null;
	  
		try{
			builder = factory.newDocumentBuilder();
			document = builder.parse( new File( fileName ) );
			//test.filterElements( document, tagFilter );
			//test.printNodeElements(document);
			
			XPath xPath =  XPathFactory.newInstance().newXPath();
			
			
			//String xPathexpr1="//*[local-name() = 'DOC']";
			//XPathExpression xpathE1=xPath.compile(xPathexpr1);
			//NodeList doc1 = (NodeList) xpathE1.evaluate(document,XPathConstants.NODESET);
			//int length=doc1.getLength();
			
			
			  
				
		
				
				//System.out.println("i:"+ i+ doc.getNodeName());
				//System.out.println("i:"+ i+ doc.getFirstChild());
				
				String xPathexpr="//*[local-name()='DOC'][starts-with(./*[local-name()='Generic']//*[local-name()='inboundinfo']/*[local-name()='CasReference'],'CRSNNL')]/*[local-name()='Generic']/*[local-name()='inboundinfo']/*[local-name()='CasReference']";

		
			
			XPathExpression xpathE=xPath.compile(xPathexpr);
			String chk=(String)xpathE.evaluate(document,XPathConstants.STRING);
			//System.out.println("Check:" + chk);
			NodeList caseRef=(NodeList) xpathE.evaluate(document,XPathConstants.NODESET);
			for (int i = 0; i < caseRef.getLength();i++) 
			{
				Node caseRefNode=caseRef.item(i);	
			//System.out.println("Check:" + caseRefNode + caseRefNode.getFirstChild().getNodeValue());
			
			//Node caseRef = (Node) xpathE.evaluate(document,XPathConstants.NODE);
			document.getFirstChild().removeChild(caseRefNode.getParentNode().getParentNode().getParentNode());
			
			//System.out.println("i" + i + caseRefNode.getParentNode().getParentNode().getParentNode());
			//doc1 = (NodeList) xpathE1.evaluate(document,XPathConstants.NODESET);
			//length=doc1.getLength();
			
			
			
			
			}
			//write the content into xml file
			String filepath="gps2.xml";
					TransformerFactory transformerFactory = TransformerFactory.newInstance();
					Transformer transformer;
					try {
						transformer = transformerFactory.newTransformer();
					
					DOMSource source = new DOMSource(document);
					StreamResult result = new StreamResult(new File(filepath));
					
						transformer.transform(source, result);
					} catch (TransformerException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	
					System.out.println("Done");
			
		} catch ( Exception e ){
			e.printStackTrace();
		}
	}
  
	 
	/*
	 * filter all elements whose tag name = filter
	 */
	public void filterElements( Node parent, String filter ) {
		
		NodeList children = parent.getChildNodes();
	  
		for( int i=0; i < children.getLength(); i++ ) {
		  
			System.out.println("--------------Length:"+ children.getLength());
			Node child = children.item( i );
		 
			System.out.println(child.getNodeName() + ":" +i);
		    
		  
			// only interested in elements
		    if( child.getNodeType() == Node.ELEMENT_NODE ) {
		    	// otherwise check its children for filtering with a recursive call
		    	filterElements( child, filter );
		    } 
		    
			else {
				if( child.getNodeValue().contains(filter) ) {
				
					parent.getParentNode().getParentNode().getParentNode().getParentNode().removeChild(child.getParentNode().getParentNode().getParentNode().getParentNode());
					//System.out.println("Check1" + parent.getParentNode().getParentNode().getParentNode().getParentNode());
					System.out.println("Check:" + i +":-" + child.getNodeValue());
				
				}
				//filterElements( child, filter );
			}
			
		
		
		}//ENFFOR;
	
	}

	  
	/*
	 * print a nodes elements and children
	 */
	public void printNodeElements( Node node ) {
	
		System.out.println( node.getNodeName() );
	  
		NodeList children = node.getChildNodes();
	  
		for ( int i = 0; i < children.getLength(); i++ ){
			Node child = children.item( i );
	  
			if( child.getNodeType() == Node.ELEMENT_NODE ) {
				printNodeElements( child );
			}
		}
	}//END printNodeElements


}//END CLASS