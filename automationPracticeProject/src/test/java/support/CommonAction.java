package support;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import stepDefinition.Hooks;

/**
 * Common Actions: This class provides common APIs corresponding to  
 *                 common actions performed on web
 * @author Saman.Tajwar
 *
 */

public class CommonAction {	

	private static Properties objectConstantProps;
	private static String testDataFile="./src/test/java/TestData.xlsx";
	private static String baseUrl="http://automationpractice.com/index.php";
	private static WebDriver driver;
	private static String TestEvidencePath = "./Screenshots";

	public static void sleep(int millSec){
		try {
			Thread.sleep(millSec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void launchUrl(){
		driver.get(baseUrl);
	}

	public static void setTimeOuts(int pageLoadTimeOutInSec, int implicitWaitInSec){
		driver.manage().timeouts().pageLoadTimeout(pageLoadTimeOutInSec, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(implicitWaitInSec, TimeUnit.SECONDS);
	}

	public static void switchToDefaultContent(){
		driver.switchTo().defaultContent();
	}

	public static void switchToFrame(String id){
		driver.switchTo().frame(getObjectValue(id));
	}

	public static void quit(){		
		driver.quit();
	}

	public static void setConstantFile(String configFilePath){
		objectConstantProps = new Properties();
		InputStream fis;
		try {
			fis = new FileInputStream(configFilePath);
			objectConstantProps.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void setDriver(WebDriver hookDriver){
		driver = hookDriver;
	}

	public static String getObjectValue(String objectName){
		return objectConstantProps.getProperty(objectName);
	}

	public static ArrayList<String> getTestData(String testCaseName){
		ArrayList<String> testData = new ArrayList<String>();

		try {
			XSSFWorkbook book = new XSSFWorkbook(testDataFile);
			XSSFSheet sheet1 = book.getSheetAt(0);
			Iterator<Row> ite = sheet1.rowIterator();
			while(ite.hasNext()){
				Row row = ite.next();
				Iterator<Cell> cite = row.cellIterator();
				while(cite.hasNext()){
					Cell c = cite.next();
					c.setCellType(Cell.CELL_TYPE_STRING);
					testData.add(c.toString());
				}
				if(testData.get(0).equals(testCaseName)){
					testData.remove(testCaseName);
					book.close();
					return testData;		
				}
				testData = null;
				testData = new ArrayList<String>();
			}
			book.close();
			return testData;		
		} catch (IOException e) {			
			e.printStackTrace();			
		}
		return testData;
	}	

	public static void captureScreenshot(){
		Hooks.scenario.embed(((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.BYTES), "image/png");
	}

	public static void captureTestEvidence(String scenarioName){
		try {
			File scrFile = ((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(TestEvidencePath+"/"+scenarioName));
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (NullPointerException npe) {;
		npe.printStackTrace();
		}
	}

	public static boolean isTextOnPagePresent(String text) {
		WebElement body = driver.findElement(By.tagName("body"));
		String bodyText = body.getText();
		return bodyText.contains(text);
	}

	public static void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}


}




