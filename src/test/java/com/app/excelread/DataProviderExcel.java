package com.app.excelread;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcel {
	
	@Test(dataProvider = "test data")
		public void test1(String data1, String data2) {
		
		System.out.println(data1);
		System.out.println(data2);
			
		}
	
	
	@DataProvider(name="test data")
	public Object[][] GetData() throws IOException{
		Object[][] data = ExcelRead("C:\\Users\\Abishek\\eclipse-workspace\\Task_17122022\\src\\"+
	"test\\resources\\Data\\Test Data.xlsx","Sheet1");
		return data;
	}

	public String[][] ExcelRead(String filepath, String sheetname) throws IOException {
		
		String[][] value = null;
		File f = new File(filepath);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(0);
		int noofrows = sh.getPhysicalNumberOfRows();
		int noofcells = row.getPhysicalNumberOfCells();
		
		value = new String [noofrows][noofcells];
		
		for(int i =0; i<noofrows; i++) {
			
			for(int j=0; j<noofcells; j++) {
				Row row1 = sh.getRow(i);
				Cell cell = row.getCell(j);
				int celltype = cell.getCellType();
				if(celltype==1) {
					value[i][j]=cell.getStringCellValue();
					System.out.println(value);
				}
				else if (celltype==0) {
					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat s = new SimpleDateFormat("MMM/dd/yyyy");
						value[i][j] = s.format(dateCellValue);
						System.out.println(value);
					}
				}
				else {
					double numericCellValue = cell.getNumericCellValue();
					long l =  (long) numericCellValue;
					value[i][j]=String.valueOf(l);
					System.out.println(value);
				}
				
			}
			
		}
		
		return value;
		
	}
	
}
