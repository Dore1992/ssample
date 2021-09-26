package datdriventest;




	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class ReadData {
		public static void main(String[] args) throws EncryptedDocumentException, IOException, InvalidFormatException 
		{
			//read data from excel
			FileInputStream fis=new FileInputStream(".//Exelfiles//Test.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(1);
			Cell cell = row.getCell(1);
			String value1 = cell.getStringCellValue();
			System.out.println(value1);
			
			//instead of above code, we can write optimized code as follows
			String value2 = wb.getSheet("Sheet1").getRow(0).getCell(4).getStringCellValue();
			System.out.println(value2);
			
			
		}

	}

	
