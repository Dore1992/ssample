package datdriventest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Print {

	public static void main(String[] args)throws EncryptedDocumentException, IOException, InvalidFormatException  {
		// TODO Auto-generated method stub
File fis= new File(".//Exelfiles//Test4.xlsx");

Workbook wb = WorkbookFactory.create(fis);
Sheet sheet=wb.getSheet("Sheet1");
int rowCount=sheet.getLastRowNum() ;
for(int i=0;i<rowCount;i++) {
	Row row=sheet.getRow(i);
	int cellCount=row.getLastCellNum();
	for(int j=0;j<rowCount;j++) {
		Cell cell=row.getCell(j);
		String value1=cell.getStringCellValue();
		System.out.println(value1);
	}
	System.out.println();
}

	}

}
