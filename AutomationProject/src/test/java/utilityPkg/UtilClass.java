package utilityPkg;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilClass {
	public static String getCellValue(String xlPath, String sheet,int rowNum,int colNum) 
	{
		try
		{
		FileInputStream fi=new FileInputStream(xlPath);
		XSSFWorkbook wb=new XSSFWorkbook(fi);

		
		XSSFCell cell=wb.getSheet(sheet).getRow(rowNum).getCell(colNum);
		if(cell.getCellType()==CellType.STRING)
		{
			return cell.getStringCellValue();
		}
		else
		{
			return cell.getRawValue();
		}
		}
		catch(Exception e)
		{
			return "";
		}
		
	
	}
	
	public static int getRowCount(String xlPath,String sheet)
	{
		try
		{
			FileInputStream fi=new FileInputStream(xlPath);
		
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			return wb.getSheet(sheet).getLastRowNum();	
		}	
		catch(Exception e)
		{
			return 0;
		}
	}


}
