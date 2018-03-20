package kh.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String arg[]){
		Properties prop = new Properties();
		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url", "jdbc.oracle.thin:@localhose:1521:xe");
		prop.setProperty("user", "sejun");
		prop.setProperty("password", "sejun");
		
		System.out.println(prop);
		try{
//			prop.storeToXML(new FileOutputStream("oracleXml.xml") ,"save xml");
			prop.store(new FileOutputStream("oracleDriver.dat"), "jdbc Oracle");
			prop.store(new FileWriter("oracleDriver.txt"), "fileWriter 이용");
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		Properties readProp = new Properties();
		try{
			readProp.loadFromXML(new FileInputStream("oracleXml.xml"));
			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		System.out.println("파일 내용을 읽은 값");
		System.out.println(readProp);
		readProp.remove("driver");
		System.out.println(readProp);
	}    
}
