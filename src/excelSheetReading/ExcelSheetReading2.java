package excelSheetReading;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetReading2 {

	public static void main(String[] args) throws Exception {
		// Reading excel file single row and column
		
		FileInputStream myfile=new FileInputStream("D:\\Selenium\\Credentials.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		String data = mysheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(data);
		String data1=mysheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(data1);
		
		
				

	}

}
