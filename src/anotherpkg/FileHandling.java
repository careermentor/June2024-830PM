package anotherpkg;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class FileHandling 
{

	public static void readdata() throws Exception
	{
		
		//File f = new File();
		
		FileReader fr = new FileReader("./TestData/abc.txt");
		
		int r = fr.read();  //r=116
		
		while(r!=-1)
		{
			System.out.print((char)r);
			r = fr.read();
		}
			
				
	}
	
	public static void writedata() throws Exception
	{
		
		File f = new File("./TestData/xyz.txt");
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("\nThis is forth line data");
		fw.flush();
		fw.close();
		
	}
	
	public static void readprop() throws Exception
	{
		
		FileReader fr = new FileReader("./TestData/data.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);
		System.out.println(prop.get("lang"));
		System.out.println(prop.get("automation"));
	}
	
	public static void main(String[] args) throws Exception {
		FileHandling.readprop();
	}
	
}
