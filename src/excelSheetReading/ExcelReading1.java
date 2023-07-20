package excelSheetReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Reading Excel sheet
		File file=new File("D:\\Selenium\\Credentials.xlsx");
		FileInputStream myFile=new FileInputStream(file);
		Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
	    int rowCount = mysheet.getLastRowNum();
	    short cellCount = mysheet.getRow(rowCount).getLastCellNum();
	    int frow = mysheet.getFirstRowNum();
	    short fcell = mysheet.getRow(frow).getFirstCellNum();
	    System.out.println(frow+" "+fcell);
	    System.out.println(rowCount +"and" + cellCount);
	    
	    for(int i=frow;i<=rowCount;i++)
	    {
	    	for(int j=fcell;j<=cellCount-1;j++)
	    	{
	    		Cell data = mysheet.getRow(i).getCell(j);
	    		CellType dataType = data.getCellType();
	    		
	    		if(dataType==CellType.STRING)
	    		{
	    			System.out.print(data.getStringCellValue()+" ");
	    		}
	    		else if(dataType==CellType.NUMERIC)
	    		{
	    			System.out.print(data.getNumericCellValue()+" ");
	    		}
	    		
	    		else if(dataType==CellType.BOOLEAN)
	    		{
	    			System.out.print(data.getBooleanCellValue()+" ");
	    		}
	    		
	    		else if(dataType==CellType.BLANK)
	    		{
	    			System.out.print(" ");
	    		}
	    	}
	    	
	    	System.out.println();
	    }
		
		

	}

}
