package generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Excelfile implements AutoConst{

	public static String getexcelData(String Excel_Path,String sheet,int row,int col){

		String vl="";
		try {
			FileInputStream fis = new FileInputStream(Excel_Path);
			Workbook wb = WorkbookFactory.create(fis);
			Cell sh = wb.getSheet(sheet).getRow(row).getCell(col);
			vl = sh.getStringCellValue();
		} catch (Exception e) {
			Reporter.log("Path is invalid");
			Assert.fail();
		}
		
		return vl;
	}	
}
