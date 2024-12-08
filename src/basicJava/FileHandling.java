package basicJava;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class FileHandling {
	
	public static void readproperties() throws Exception {
		FileReader fr = new FileReader("./TestData/abc.properties");
		Properties prop = new Properties();
		prop.load(fr); // load this file to the memory
		System.out.println(prop.get("name")); // get the value of name prop
		System.out.println(prop.get("automation")); // get the value of automation prop
	}
	
	public static void writedata() throws Exception {
		File f = new File("C:\\Users\\trebm\\Desktop\\TestData\\data2.txt"); // File connection
		FileWriter fw = new FileWriter(f , true); // true adds to the current file
		fw.write("\nThis is second line of data"); // \n adds a new line
		fw.flush(); // Saves the file
		fw.close();; // Closes the file
	}
		
	public static void readdata() throws Exception {
		File f = new File("./TestData/data1.txt"); // File connection, retreiving from projec folder
		FileReader fr = new FileReader(f);
		
		int r = fr.read();
		while(r != -1){
			System.out.print((char)r); // T
			r = fr.read(); // ASCII value of 84, also r = -1
		}
		
		/*
		System.out.print((char)r);
		r = fr.read();
		System.out.print((char)r);
		r = fr.read();
		System.out.print((char)r);
		r = fr.read();
		System.out.print((char)r);
		r = fr.read();
		System.out.print((char)r);
		r = fr.read();
		System.out.print((char)r);
		r = fr.read();
		System.out.print((char)r);
		r = fr.read();
		System.out.print((char)r);
		r = fr.read();
		System.out.print((char)r);
		r = fr.read();
		System.out.print((char)r);
		r = fr.read();
		System.out.print((char)r);
		r = fr.read();
		System.out.print((char)r);
		*/
	}
	
	public static void main(String[] args) throws Exception{
		//readdata();
		//writedata();
		readproperties();
	}
}
