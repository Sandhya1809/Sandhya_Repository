package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData 
{
	public void Read(int rowno) throws IOException
	{
		File f=new File("../FileHandling/Demo.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s;
		for(int i=1;i<6;i++)
		{
			if(i==rowno)
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
	public static void main(String[] args) throws IOException
	{
		ReadData rd=new ReadData();
		rd.Read(3);
	}
}
