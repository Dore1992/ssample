package datdriventest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writedata {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(".//Exelfiles//Test.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("Sheet1");
		sheet.getRow(1).createCell(1).setCellValue("Bangalore");
		sheet.getRow(1).getCell(1).setCellValue("Bangalore");
		sheet.createRow(2).createCell(0).setCellValue("dore");
		sheet.createRow(1).createCell(0).setCellValue("8 pm batch");
		FileOutputStream fos=new FileOutputStream(".//Exelfiles//Test2.xlsx");
		
		wb.write(fos);
	}

}
