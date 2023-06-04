package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
	public static Object[][] read(String sh) throws IOException
	{
		DataFormatter formatter = new DataFormatter();
		FileInputStream f=new FileInputStream("../demo1/DEMO1.xlsx");
		XSSFWorkbook wk=new XSSFWorkbook(f);
		XSSFSheet sheet=wk.getSheet(sh);
		int row = sheet.getPhysicalNumberOfRows();
		int cell = sheet.getRow(0).getPhysicalNumberOfCells();
		int rw=0,cl=0;
		System.out.println(row+" "+cell);
		Object[][] ob=new Object[row-1][cell];
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<cell;j++)
			{
				ob[rw][cl++]=
		//sheet.getRow(i).getCell(j).toString(); 
		
				formatter.formatCellValue(sheet.getRow(i).getCell(j)).toString();
				System.out.println(formatter.formatCellValue(sheet.getRow(i).getCell(j)).toString());
				
			}
			cl=0;
			rw++;
		}
		/*int r = 1, c = 0;
		Object[][] ob = new Object[row-1][cell];
		while(r < row )
		{
			while(c < cell)
			{
				ob[r-1][c] = formatter.formatCellValue(sheet.getRow(r).getCell(c)).toString();
				System.out.println(formatter.formatCellValue(sheet.getRow(r).getCell(c)).toString());
				c++;
				
			}
			c=1;
			r++;
		}
		*/
		return ob;		
	}
	

}
