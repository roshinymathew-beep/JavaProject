package testPkg;

import org.testng.annotations.Test;

import basePkg.BaseClass;
import pagePkg.PageClass;
import utilityPkg.UtilClass;


public class TestClass  extends BaseClass{
	@Test
	public void testMethod() throws InterruptedException
	{
	PageClass p1=new PageClass(driver);
	p1.logoVerification();
	//p1.brokenLinks();
	
	
	String xlPath="D:\\SW Testing\\ExcelDataDriven\\cakehut_data.xlsx";
	String sheetName="Sheet1";
	int rowCount=UtilClass.getRowCount(xlPath, sheetName);
	for(int i=1;i<=rowCount;i++)
	{
		String userName=UtilClass.getCellValue(xlPath, sheetName, i, 0);
		String password =UtilClass.getCellValue(xlPath, sheetName, i, 1);
		p1.setValues(userName, password);
		p1.clickLoginBtn();
		
	}
	
	p1.successLogin();

	}

}
