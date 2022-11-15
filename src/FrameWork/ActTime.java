package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActTime {
public static void main(String[] args) throws Throwable {
	FileInputStream f=new FileInputStream("C:\\Users\\yoges\\Documents\\ActiTimeCredentilas.xlsx");
	Sheet s=WorkbookFactory.create(f).getSheet("sheet1");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://demo.actitime.com/login.do");
	String UN=s.getRow(0).getCell(0).getStringCellValue();
	w.findElement(By.xpath("//input[@name='username']")).sendKeys(UN);
	String PW=s.getRow(0).getCell(1).getStringCellValue();
	w.findElement(By.xpath("//input[@name='pwd']")).sendKeys(PW);
	
	w.findElement(By.xpath("//div[text()='Login ']")).click();
	String ExpTitle="actiTIME -  Enter Time-Track";
	String actTitle=s.getRow(0).getCell(2).getStringCellValue();
	if(ExpTitle.equals(actTitle)) {
		System.out.println("It is perfect");
	}
	else {
		System.out.println("Sorry It's wrong Report to developer");
	}
}
}
