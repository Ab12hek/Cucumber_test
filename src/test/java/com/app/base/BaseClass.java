package com.app.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

//import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver = null;
	public static void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void getUrl(String url) {
		driver.get(url);
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
	public static void clear(WebElement element) {
		element.clear();
	}
	
	public static void typedata(WebElement element, String data) {
		element.sendKeys(data);	
	}
	public static WebElement findElementById(String location) {
		return driver.findElement(By.id(location));	
	}
	
	public static WebElement findElementByname(String name) {
		return driver.findElement(By.name(name));	
	}
	
	public static String getValue(String by) {
		return driver.findElement(By.id(by)).getAttribute("value");
	}
	
	public static void selectindex(WebElement element, int data) {
		Select s =new Select(element);
		s.selectByIndex(data);
	}
	public static void selectbyvalue(WebElement element, String value) {
		Select s =new Select(element);
		s.selectByValue(value);
	}
	
	public static void selectbyvisibletext(WebElement element, String value) {
		Select s =new Select(element);
		s.selectByVisibleText(value);;
	}
	
	public static void wait(int w, String elementpath) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(w));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementpath)));
	}
	
	public static WebElement findElementBy(By by) {
		return driver.findElement(by);
		
	}
	
	public static String getValueby(By by) {
		return driver.findElement(by).getAttribute("value");
	}
	
	public static String getValuebyPF(WebElement element) {
		
		element.getAttribute("value");
		
		System.out.println(element.getAttribute("value"));
		
		return element.getAttribute("value");
	}
	
	/*public static void FileWriter (String element, String fileName){
		   
	    try (FileWriter fw = new FileWriter(new File(fileName), true)) {
	 
	      fw.write(element+"\n");
	      fw.close();
	      
	    }
	    catch(IOException e) {
	    	e.printStackTrace();
	    }
	}*/
	
	public static void ActionsClass() {
		try{
			Actions action = new Actions(driver);
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static String excelreadreusable(int i, int j) {
		String value = null;
		try {
			File f = new File("D:\\Project_Dec\\src\\test\\resources\\Test Data\\AdactionHotel_testdata.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(j);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				value = cell.getStringCellValue();
				System.out.println(value);

			} else if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat s = new SimpleDateFormat("MMM/dd/yyyy");
					value = s.format(dateCellValue);
					System.out.println(value);
				} else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					value = String.valueOf(l);
					System.out.println(value);
				}
				wb.close();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
	
	/*public static void TakeScreenshots() {
		
		try {
			Date d = new Date();
	        System.out.println(d.toString());

	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss");   
	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(scrFile, new File("D:\\RND\\"+sdf.format(d)+".png"));
	        		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}*/


}
