package pkg1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class JXLAssign5RW 
{
public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException
{
	File f=new File("C:\\Users\\Hanika\\Desktop\\DemoXLS.xls");
	Workbook wk=Workbook.getWorkbook(f);
	Sheet ws=wk.getSheet(0);
	int r=ws.getRows();
	int c=ws.getColumns();
	
	File f1=new File("C:\\Users\\Hanika\\Desktop\\DemoXlse.xls");//
	WritableWorkbook wk1=Workbook.createWorkbook(f1);
	WritableSheet ws1=wk1.createSheet("Sheet_1", 0);
	String data;
	for(int i=0;i<r;i++)
	{
		for(int j=c;j<5;j++)
		{
			Cell c1=ws.getCell(j, i);
			data=c1.getContents();
			Label l=new Label(j,i,data);
			ws1.addCell(l);
		}
	}
	wk1.write();
	wk1.close();
}
}
