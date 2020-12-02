package pkg1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.JxlWriteException;
import jxl.write.biff.RowsExceededException;

public class JXLAssign4Write 
{
public void WriteData(int rowcount,int columncount) throws IOException, RowsExceededException, WriteException
{
	File f=new File("C:\\Users\\Hanika\\Desktop\\Assign45.xls");
	WritableWorkbook wk= Workbook.createWorkbook(f);
	WritableSheet ws=wk.createSheet("Sheet_1", 0);
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the data");
	String data;
	
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(i==rowcount && j==columncount)
			{
				data=s.next();
				Label l=new Label(j,i,data);
				ws.addCell(l);
			}
		}
	}
	wk.write();
	wk.close();
}
public static void main(String[] args) throws JxlWriteException, WriteException, IOException 
{
	JXLAssign4Write a4=new JXLAssign4Write();
	a4.WriteData(1,2);
}
}
