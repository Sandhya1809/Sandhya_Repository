package pkg1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class JxljarXLS 
{
	public static void main(String[] args) throws IOException, BiffException 
	{
	File f=new File("../FileHandling/DemoXLS.xls");
	Workbook wk=Workbook.getWorkbook(f);
	Sheet ws=wk.getSheet(0);
	//int r=ws.getRows();
	//int c=ws.getColumns();
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			Cell c1=ws.getCell(j, i);
			System.out.println(c1.getContents());
		}
	}
	}
}
