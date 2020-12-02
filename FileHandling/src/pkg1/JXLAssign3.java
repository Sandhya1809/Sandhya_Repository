package pkg1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JXLAssign3
{
public void ReadDataFromRange(int initial_row, int end_row) throws BiffException, IOException
{
	File f=new File("../FileHandling/DemoXLS.xls");
	Workbook wk=Workbook.getWorkbook(f);
	Sheet ws=wk.getSheet(0);
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(i>=initial_row && i<=end_row)
			{
				Cell c1=ws.getCell(j, i);
						System.out.print(c1.getContents());
			}
		}
	}
}
public static void main(String[] args) throws BiffException, IOException
{
	JXLAssign3 a3=new JXLAssign3();
	a3.ReadDataFromRange(0,1);
}
}
