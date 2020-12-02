package pkg1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.JXLException;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.biff.JxlWriteException;

public class XlsWrite 
{

public static void main(String[] args) throws IOException, JxlWriteException, JXLException
{
	File f=new File("C:\\Users\\Hanika\\Desktop\\DemoXLsgk.xls");
	WritableWorkbook wk= Workbook.createWorkbook(f);
	WritableSheet ws=wk.createSheet("Sheet_1", 0);
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter the total rows");
	int r=s.nextInt();
	
	System.out.println("Enter the total columns");
	int c=s.nextInt();
	
	System.out.println("Enter the data");
	String Data;
	
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			Data=s.next();
			Label l=new Label(j,i,Data);
			ws.addCell(l);
			
		}
	}
	wk.write();
	wk.close();
}
}
