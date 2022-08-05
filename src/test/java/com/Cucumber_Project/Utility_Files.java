package com.Cucumber_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;




public class Utility_Files {

	public static WebDriver driver;

	public static WebDriver get_Browser(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;

	}
	
	public static WebElement find_Element(String name ) {
		WebElement findElement = driver.findElement(By.xpath(name));
		return findElement;
	}
	
	public static String get_Title() {
		String title = driver.getTitle();
		return title;
		
	}
	
	public static boolean isEnabled(WebElement ele) {

		boolean enabled = ele.isEnabled();
		return enabled;
	}
	
	public static void navigate( String type) {
		
		if (type.equalsIgnoreCase("to")) {
			driver.navigate().to("url");
		}else if (type.equalsIgnoreCase("back")) {
			driver.navigate().back();
		}else if (type.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		}else  {
			type.equalsIgnoreCase("refresh");
		} 		
			
	}
public static void dropdown(WebElement element ,String type ,String data) {
		
		Select s = new Select(element);
		
		if (type.equalsIgnoreCase("byvalue")) {
			
			s.selectByValue(data);
			
		}else if (type.equals("byText")) {
			
			s.selectByVisibleText(data);
		}else {
			
			int value = Integer.parseInt(data);
			s.selectByIndex(value);
		}
	}

public static String particular_Cell(String path , int sheet_Index , int row_Index , int cell_Index) throws IOException {
	String Value = null; 
	File f = new File(path);
	FileInputStream fis = new FileInputStream(f);
	Workbook work = new XSSFWorkbook(fis);
	Sheet s = work.getSheetAt(sheet_Index);
	Row row = s.getRow(row_Index);
	Cell cell_Data = row.getCell(cell_Index);
	CellType type = cell_Data.getCellType();
	if (type.equals(CellType.STRING)) {
	Value = cell_Data.getStringCellValue();
	}else if (type.equals(CellType.NUMERIC)) {
		double numericCellValue = cell_Data.getNumericCellValue();
	Value =	String.valueOf(numericCellValue);
	}
	work.close();
	return Value;

	
}


	public static void checkbox(WebElement ele) {
		ele.click();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void close() {
		driver.close();
	}
	
	public static String get_Currenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public static void get(String url) {
		driver.get(url);
		
	}

	public static void click_On_Element(WebElement ele) {
		ele.click();
	}

	public static void send_Keys(WebElement ele, String data) {
		ele.sendKeys(data);
	}

	public static String takesScreenshot(String path) throws IOException {
		TakesScreenshot ts =  (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);
		return path;
	}

	public static void click_Hold(WebElement ele) {
		Actions a = new Actions(driver);
		a.clickAndHold(ele).build().perform();
	}

	public static void move_Element(WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).build().perform();
	}
	
	
	public static void javaScript_click(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
	}
	
	public static void javaScript_Scrollup_Down(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);
	
	}
	
	public static String get_Text(WebElement ele) {
		String text = ele.getText();
		return text;
	}

	public static void main(String[] args) throws IOException,InterruptedException {

	}

}
