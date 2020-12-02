package pkg1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JXLAssign2 
{
public void ReadDataFromRow(int row_no) throws BiffException, IOException
{
	File f=new File("../FileHandling/DemoXLS.xls");
	Workbook wk=Workbook.getWorkbook(f);
	Sheet ws=wk.getSheet(0);
	 for(int i=0;i<4;i++)
	 {
		 for(int j=0;j<4;j++)
		 {
			 if(i==row_no)
			 {
				 Cell c1=ws.getCell(j, i);
						 System.out.print(c1.getContents());
			 }
		 }
	 }
}
public static void main(String[] args) throws BiffException, IOException 
{
	JXLAssign2 a2=new JXLAssign2 ();
	a2.ReadDataFromRow(1);
}
}
