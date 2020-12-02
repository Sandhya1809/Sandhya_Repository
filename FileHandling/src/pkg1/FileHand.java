package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHand 
{
public static void main(String[] args) throws IOException 
{
	File f=new File("../FileHandling/Demo.txt");
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	//int a;
	//while((a=fr.read())!=-1)
	//{
	//	System.out.print((char)a);
	//}
	String s;
	while((s=br.readLine())!=null)
	{
		System.out.println(s);
	}
	
}
}
