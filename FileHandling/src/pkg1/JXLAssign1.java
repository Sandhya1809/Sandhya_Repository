package pkg1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JXLAssign1 
{
public void ReadDataFromCell(int row_no, int column_no) throws BiffException, IOException
{
	File f=new File("../FileHandling/DemoXLS.xls");
	Workbook wk=Workbook.getWorkbook(f);
	Sheet ws=wk.getSheet(0);
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(i==row_no && j==column_no)
			{
				Cell c1=ws.getCell(j,i);
				System.out.println(c1.getContents());
			}
		}
	}	
}
public static void main(String[] args) throws BiffException, IOException 
{
	JXLAssign1 rd=new JXLAssign1();
	rd.ReadDataFromCell(1, 2);
	
}
}
