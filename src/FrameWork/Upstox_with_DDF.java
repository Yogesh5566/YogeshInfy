package FrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upstox_with_DDF {
public static void main(String[] args) throws Throwable {
	FileInputStream f=new FileInputStream("C:\\Users\\yoges\\Documents\\Credentials for upstox.xlsx");
	Sheet sheet = WorkbookFactory.create(f).getSheet("sheet1");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.manage().deleteAllCookies();
	w.manage().window().maximize();
	w.get("https://login-v2.upstox.com/");
	w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String UN=sheet.getRow(0).getCell(0).getStringCellValue();
	w.findElement(By.xpath("//input[@id='userCode']")).sendKeys(UN);
	String PW=sheet.getRow(0).getCell(1).getStringCellValue();
	w.findElement(By.xpath("//input[@id='password']")).sendKeys(PW);
	w.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
	
	String YOB=sheet.getRow(0).getCell(2).getStringCellValue();
	w.findElement(By.xpath("//input[@id='yob']")).sendKeys(YOB);
	
	w.findElement(By.xpath("//div[text()='No, I’m good']")).click();
	String actT=w.getTitle();
	String expT=sheet.getRow(0).getCell(3).getStringCellValue();
	if(expT.equals(actT)) {
		System.out.println("Expected title and Actual title are same.Developer has done the right job");
	}
	else {
		System.out.println("Expected title ans Actual title are different.Please report to developer");
	}
}
}
