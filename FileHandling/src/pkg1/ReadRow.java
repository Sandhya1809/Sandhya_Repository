package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadRow 
{
	
public static void main(String[] args) throws IOException 
{
	File f=new File("../FileHandling/Demo.txt");
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	int i;
	String s;
	for(i=1;i<=6;i++)
	{
		if(i>=2 && i<=4)
		{
			s=br.readLine();
		System.out.println(s);
		}
		else
		{
			br.readLine();
		}
	}

	
}
}
