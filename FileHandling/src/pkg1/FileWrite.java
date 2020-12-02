package pkg1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class FileWrite 
{
public static void main(String[] args) throws IOException
{
	File f=new File("../FileHandling/Demo2.txt");
	FileWriter fw=new FileWriter(f,true);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.newLine();
	bw.write("Saurabh Is Doing His Worke");
	bw.newLine();
	bw.write("Saurabh Is Very Smart");
	//bw.newLine();
	//bw.write("Sandhya Is On Maternity Leave");
	
	bw.close();
}
}
