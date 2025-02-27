package excelhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) {
		
		// 1 Define the Source file path
		File file = new File("./src/test/resources/testdata/datasheet.xlsx");
		// 2 Create an object of FileInputStream class and pass this file as an argument
		try 
		{
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			String row = wb.getSheetAt(0).getRow(0).getCell(0).toString();
//			System.out.println(row);
			String col = wb.getSheetAt(0).getRow(0).getCell(1).toString();
			System.out.println(row+" "+col);
			
			int count = wb.getSheetAt(0).getLastRowNum()+1;
			System.out.println("Total no of active rows : "+count);
			
			System.out.println("**********************************");
			System.out.println();
			
			for(int i=0; i<count; i++)
			{
				String row1 = wb.getSheetAt(0).getRow(i).getCell(0).toString();
				String col1 = wb.getSheetAt(0).getRow(i).getCell(1).toString();
				System.out.println(row1+" "+col1);
			}
			
		} 
		
		
		
		
		
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
