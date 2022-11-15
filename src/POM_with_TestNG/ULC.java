package POM_with_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_with_DDF.ActTimeHomePage;
import POM_with_DDF.ActTimepage;

public class ULC  {
public static void main(String[] args) throws Throwable {
	

	
	
	FileInputStream f=new FileInputStream("C:\\Users\\yoges\\Documents\\ActiTimeCredentilas.xlsx");
	Sheet sh = WorkbookFactory.create(f).getSheet("sheet1");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	ActiTimeLoginPage a=new 	ActiTimeLoginPage (driver);
	ActTimeHomePage a1=new ActTimeHomePage(driver);
	
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String username=sh.getRow(0).getCell(0).getStringCellValue();
	System.out.println(username);
	a.enterUN(username);
	String password=sh.getRow(0).getCell(1).getStringCellValue();
	a.enterPW(password);
	a.clikLGN();
	
		
	
	String actText=sh.getRow(0).getCell(2).getStringCellValue();
	a1.verifyTxt(actText);

	
	
}	
	
}

