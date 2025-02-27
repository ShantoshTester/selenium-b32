package excelhandling;

import utils.ExcelHelper;

public class TestExcelHelper {

	public static void main(String[] args) {
		
		ExcelHelper excel = new ExcelHelper("./src/test/resources/testdata/datasheet.xlsx");
		int c1 = excel.getRowCount("shantosh");
		
		for(int i=0; i<c1; i++)
		{
			String row = excel.getCellData("shantosh", i, 0);
			String col = excel.getCellData("shantosh", i, 1);
			System.out.println(row+" "+col);
		}
	}

}
